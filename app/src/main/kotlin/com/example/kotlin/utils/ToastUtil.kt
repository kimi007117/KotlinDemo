package com.example.kotlin.utils

import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.example.kotlin.common.AppApplication
import com.example.kotlindemo.R


/**
 * Created by lijie on 2019-05-09.
 */
object ToastUtil {

    fun showToast(message: String) {
        val context = AppApplication.context
        val toast = Toast(context)
        val inflate = LayoutInflater.from(context).inflate(R.layout.custom_toast, null)
        val messageText = inflate.findViewById<TextView>(R.id.text_message)
        messageText.text = message
        toast.view = inflate
        toast.duration = Toast.LENGTH_SHORT
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    fun showLongToast(message: String) {
        val context = AppApplication.context
        val toast = Toast(context)
        val inflate = LayoutInflater.from(context).inflate(R.layout.custom_toast, null)
        val messageText = inflate.findViewById<TextView>(R.id.text_message)
        messageText.text = message
        toast.view = inflate
        toast.duration = Toast.LENGTH_LONG
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

}