package com.wangfeixixi.fram.anko

import android.os.Bundle
import org.jetbrains.anko.*
import wangfeixixi.mvp.BaseA
import wangfeixixi.mvp.BaseP
import wangfeixixi.mvp.BaseV

class AnkoSampleActivity : BaseA<BaseV, BaseP<BaseV>>(), BaseV {
    override fun onCreateView(): Int = 0

    override fun initView(savedInstanceState: Bundle?) {
        verticalLayout {
            padding = dip(30)
            val a = editText {
                hint = "Name"
                textSize = 24f
            }
            val b = editText {
                hint = "Password"
                textSize = 24f
            }
            button("Login") {
                toast("" + a.text.trim().toString() + b.text.trim().toString())
            }

        }
    }

    override fun createPresenter(): BaseP<BaseV> = BaseP()
}