package com.wangfeixixi.fram.simple.f

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.wangfeixixi.fram.R
import kotlinx.android.synthetic.main.b_fragment.*
import kotlinx.android.synthetic.main.vs_test.view.*
import wangfeixixi.fram.BaseF
import wangfeixixi.fram.BaseP
import wangfeixixi.fram.BaseV

class BFragment : BaseF<BaseV, BaseP<BaseV>>(), BaseV, View.OnClickListener {
    override fun initView(view: View, savedInstanceState: Bundle?) {

    }

    var isShow = false;

    override fun onClick(v: View?) {
        isShow = !isShow
        showNoNet(isShow)
        showToste(null)
    }

    private fun showToste(msg: String?) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
    }

    private var TAG = "BFragment"


    var v_no_net: View? = null

    fun showNoNet(isShow: Boolean) {
        v_no_net = vs_test?.inflate() ?: v_no_net
        v_no_net?.tv_test_test?.setOnClickListener(View.OnClickListener {
            TAG += "1";
        })
        v_no_net?.visibility = if (isShow) View.VISIBLE else View.GONE
    }

    override fun initData(firstLoad: Boolean, isVisibleToUser: Boolean) {
//        Log.d(TAG, "firstLoad" + firstLoad + "isVisibleToUser" + isVisibleToUser)
    }

    override fun createPresenter(): BaseP<BaseV> = BaseP()
    override fun initContentRes(): Int = R.layout.b_fragment


}
