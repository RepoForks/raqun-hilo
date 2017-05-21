package com.raqun.hilo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.LayoutRes
import android.support.annotation.MenuRes
import android.support.annotation.StringRes
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

/**
 * Created by tyln on 21/05/2017.
 */
abstract class BaseActivity : AppCompatActivity() {
    var NAVIGATION_TYPE_ROOT: Int = 0
    var NAVIGATION_TYPE_BACK: Int = 1

    @LayoutRes
    protected abstract fun getLayoutRes(): Int

    @StringRes
    protected abstract fun getTitleRes(): Int

    @MenuRes
    protected abstract fun getMenuRes(): Int

    protected abstract fun getNavigationType(): Int

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutRes())
        setupActionBar()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (getMenuRes() != Constants.NO_RES) {
            menuInflater.inflate(getMenuRes(), menu)
            return true
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setupActionBar() {
        if (getTitleRes() != Constants.NO_RES) {
            setActionBarTitle(getString(getTitleRes()))
        }

        when (getNavigationType()) {
            NAVIGATION_TYPE_BACK -> supportActionBar?.setDisplayHomeAsUpEnabled(true)
            NAVIGATION_TYPE_ROOT -> supportActionBar?.setDisplayHomeAsUpEnabled(false)
        }
    }

    protected fun setActionBarTitle(title: CharSequence?) {
        supportActionBar?.title = title
    }
}