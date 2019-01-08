package com.wangfeixixi.sample.simple.f

import android.os.Bundle
import android.util.Log
import android.view.View
import com.wangfeixixi.sample.R
import kotlinx.android.synthetic.main.a_fragment.*
import wangfeixixi.utils.BaseF
import wangfeixixi.utils.BaseP
import wangfeixixi.utils.BaseV

class AFragment : BaseF<BaseV, BaseP<BaseV>>(), BaseV {
    override fun initView(view: View, savedInstanceState: Bundle?) {
        tv_name.text = TAG
    }

    override fun createPresenter(): BaseP<BaseV> = BaseP()
    private val TAG = "AFragment"

    override fun initContentRes(): Int = R.layout.a_fragment


    override fun initData(firstLoad: Boolean, isVisibleToUser: Boolean) {
        Log.d(TAG, "firstLoad" + firstLoad + "isVisibleToUser" + isVisibleToUser)
        //        presenter.asdfas();
    }

}
