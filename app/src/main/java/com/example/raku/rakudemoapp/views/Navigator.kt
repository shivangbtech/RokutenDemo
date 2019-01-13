package com.example.raku.rakudemoapp.views

import android.content.Intent
import com.example.raku.rakudemoapp.base.BaseActivity
import com.example.raku.rakudemoapp.constants.AppConstants
import com.example.raku.rakudemoapp.views.home.DetailsActivity


class Navigator private constructor() {
    init {
        println("This ($this) is a singleton")
    }

    private object Holder {
        val INSTANCE = Navigator()
    }

    companion object {
        val instance: Navigator by lazy { Holder.INSTANCE }
    }

    fun navigateToDetails(activity: BaseActivity, id: String) {
        val intent: Intent = Intent(activity, DetailsActivity::class.java)
        intent.putExtra(AppConstants.PARAM_ID, id)
        activity.startActivity(intent)
    }
}