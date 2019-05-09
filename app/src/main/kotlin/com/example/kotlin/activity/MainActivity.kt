package com.example.kotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.utils.ToastUtil
import com.example.kotlindemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_main.text = getText()
        ToastUtil.showLongToast("hhhhh")
    }

    private fun getText(): String {
        return "哈哈哈 呵呵呵"
    }
}
