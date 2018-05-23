package com.wangfeixixi.fram.simple

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import com.wangfeixixi.fram.R
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

    }

    override fun onCreateView(): Int = R.layout.kotlin_sample_activity
    override fun createPresenter(): BaseP<BaseV> = BaseP()

    fun showHello(greetingText: String) {
        tv_text.setTextColor(Color.RED)
        tv_text.setText(greetingText)
    }

    fun showGoodbye(greetingText: String) {
        tv_text.setTextColor(Color.BLUE)
        tv_text.setText(greetingText)
    }

}
