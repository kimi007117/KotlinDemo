package com.example.kotlin.common

import android.app.Application
import android.content.Context

/**
 * Created by lijie on 2019-05-09.
 */
class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        mContext = this
    }

    companion object {

        private var mContext: Application? = null

        /**
         *下面的代码等同于
         * fun getContext():Context{
         *     return mContext!!.applicationContext
         * }
         */
        val context: Context
            get() = mContext!!.applicationContext

    }

}