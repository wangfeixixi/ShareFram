package com.wangfeixixi.sample.simple.f

import android.os.Bundle
import android.util.Log
import android.view.View
import com.wangfeixixi.sample.R
import wangfeixixi.utils.BaseF
import wangfeixixi.utils.BaseP
import wangfeixixi.utils.BaseV


class CFragment : BaseF<BaseV, BaseP<BaseV>>(), BaseV{
    override fun initView(view: View, savedInstanceState: Bundle?) {

    }

    override fun createPresenter(): BaseP<BaseV>  = BaseP()
    override fun initContentRes(): Int = R.layout.a_fragment

    private val TAG = "CFragment"

    protected fun onUserVisible(isVisible: Boolean) {

        Log.d(TAG, "onUserVisible$isVisible")
    }


    override fun initData(firstLoad: Boolean, isVisibleToUser: Boolean) {

        Log.d(TAG, "firstLoad" + firstLoad + "isVisibleToUser" + isVisibleToUser)
    }

}
