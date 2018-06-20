package com.wangfeixixi.fram.simple

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import android.util.Log
import com.igexin.sdk.PushManager
import com.wangfeixixi.fram.R
import com.wangfeixixi.fram.push.DemoIntentService
import com.wangfeixixi.fram.simple.f.AFragment
import com.wangfeixixi.fram.simple.f.BFragment
import com.wangfeixixi.fram.simple.f.CFragment
import com.wangfeixixi.fram.simple.f.DFragment
import kotlinx.android.synthetic.main.kotlin_sample_activity.*
import wangfeixixi.fram.BaseA
import wangfeixixi.fram.BaseF
import wangfeixixi.fram.BaseP
import wangfeixixi.fram.BaseV
import java.util.*


class KotlinSampleActivity : BaseA<BaseV, BaseP<BaseV>>(), BaseV {
    override fun initView(savedInstanceState: Bundle?) {


        val fragments = ArrayList<BaseF<BaseV, BaseP<BaseV>>>()
        fragments.add(AFragment())
        fragments.add(BFragment())
        fragments.add(CFragment())
        fragments.add(DFragment())

        vp.setAdapter(object : FragmentStatePagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int): Fragment {
                return fragments[position]
            }

            override fun getCount(): Int {
                return fragments.size
            }
        })

        btn_ok.setOnClickListener {
            tv_text.text = test0
        }
        btn_no.setOnClickListener {

            tv_text.text = test
        }
        Log.e("push", "开始启动");
        // com.getui.demo.DemoIntentService 为第三方自定义的推送服务事件接收类
        PushManager.getInstance().registerPushIntentService(this.applicationContext, DemoIntentService::class.java)
        val clientID = PushManager.getInstance().getClientid(this.applicationContext)


    }

    var test0: String = "test0"

    val test: String by lazy {
        test0 = test0 + 1
        tv_text.text = test0
        tv_text.text = "asdfasf "

        test0
    }


    override fun onCreateView(): Int = R.layout.kotlin_sample_activity
    override fun createPresenter(): BaseP<BaseV> = BaseP()

    fun showHello(greetingText: String) {
        tv_text.setTextColor(Color.RED)
        tv_text.setText(greetingText)
    }

    fun showGoodbye(greetingText: String) {
        tv_text.setTextColor(Color.BLUE); tv_text.setText(greetingText)
    }
}