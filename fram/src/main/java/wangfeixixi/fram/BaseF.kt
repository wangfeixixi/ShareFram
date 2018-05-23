package wangfeixixi.fram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.mosby3.mvp.MvpFragment
import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView

abstract class BaseF<V : MvpView, P : MvpPresenter<V>> : MvpFragment<V, P>() {

    private var isPrepared = false
    private var firstLoad = true

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflate = LayoutInflater.from(context).inflate(initContentRes(), null)
        return inflate
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isPrepared = true
        initView(view, savedInstanceState)
        lazyLoad()

    }

    protected abstract fun initContentRes(): Int

    abstract override fun createPresenter(): P

    protected abstract fun initView(view: View, savedInstanceState: Bundle?)

    protected abstract fun initData(firstLoad: Boolean, isVisibleToUser: Boolean)


    private fun lazyLoad() {
        if (isPrepared) {
            if (userVisibleHint && firstLoad) {
                initData(firstLoad, userVisibleHint)
                firstLoad = false
                return
            }
            initData(false, userVisibleHint)
        }
    }


    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        lazyLoad()
    }


}
