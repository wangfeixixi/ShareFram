package com.wangfeixixi.sample.simple

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import android.util.Log
import com.wangfeixixi.sample.R
import com.wangfeixixi.sample.simple.f.AFragment
import com.wangfeixixi.sample.simple.f.BFragment
import com.wangfeixixi.sample.simple.f.CFragment
import com.wangfeixixi.sample.simple.f.DFragment
import kotlinx.android.synthetic.main.kotlin_sample_activity.*
import wangfeixixi.utils.BaseA
import wangfeixixi.utils.BaseF
import wangfeixixi.utils.BaseP
import wangfeixixi.utils.BaseV
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