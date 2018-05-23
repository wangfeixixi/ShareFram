package wangfeixixi.fram

import android.app.Activity
import android.os.Bundle
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView

abstract class BaseA<V : MvpView, P : MvpPresenter<V>> : MvpActivity<V, P>() {

    lateinit var mCtx: Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mCtx = this
        onCreateView()?.let { setContentView(it) }
        initView(savedInstanceState)
    }
    protected abstract fun onCreateView(): Int?

    protected abstract fun initView(savedInstanceState: Bundle?)

}