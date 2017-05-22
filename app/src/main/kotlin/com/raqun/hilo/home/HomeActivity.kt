package com.raqun.hilo.home

import com.raqun.hilo.BaseActivity
import android.os.Bundle
import com.raqun.hilo.Constants
import com.raqun.hilo.R

/**
 * Created by tyln on 21/05/2017.
 */

class HomeActivity : BaseActivity() {

    override fun getLayoutRes(): Int {
        return R.layout.activity_home
    }

    override fun getTitleRes(): Int {
        return R.string.app_name
    }

    override fun getMenuRes(): Int {
        return Constants.NO_RES
    }

    override fun getNavigationType(): Int {
        return NAVIGATION_TYPE_ROOT
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
