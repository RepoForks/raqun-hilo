package com.raqun.hilo.home

import android.content.Context
import android.content.Intent
import com.raqun.hilo.BaseActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
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
        val cards: RecyclerView = findViewById(R.id.cards) as RecyclerView

        val layoutManager: LinearLayoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        cards.layoutManager = layoutManager
        cards.setHasFixedSize(true)
    }
}
