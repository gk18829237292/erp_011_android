package com.gk.erp.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by ke.gao on 2017/7/18.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView();
        initData();
    }

    abstract fun initView();
    abstract fun initData();
}