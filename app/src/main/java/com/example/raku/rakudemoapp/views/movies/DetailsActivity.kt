package com.example.raku.rakudemoapp.views.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.widget.Toast
import com.example.raku.rakudemoapp.R
import com.example.raku.rakudemoapp.components.Event
import com.example.raku.rakudemoapp.constants.AppConstants
import com.example.raku.rakudemoapp.helper.GlideHelper
import com.example.raku.rakudemoapp.models.BaseResponseModal
import com.example.raku.rakudemoapp.models.movies.MovieDetails
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    private lateinit var mMovieViewModel: MovieViewModel
    private lateinit var mId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        mMovieViewModel = ViewModelProviders.of(this@DetailsActivity).get(MovieViewModel::class.java)
        mId = intent.getStringExtra(AppConstants.PARAM_ID)
        handleObserver()
        handleUI()
    }

    override fun onStart() {
        super.onStart()
        if (!TextUtils.isEmpty(mId)) {
            mMovieViewModel.getDetails(mId)
        }
    }

    /**
     * Method call to initialize observer
     */
    private fun handleObserver() {
        mMovieViewModel.mldDetails.observe(this, mDetailsObserver)
        mMovieViewModel.mldError.observe(this@DetailsActivity, onErrorObserver)
    }

    /**
     * Method call to handle UI
     */
    private fun handleUI() {

    }

    /**
     * Details observer
     */
    private val mDetailsObserver: Observer<MovieDetails> = Observer {
        tv_title_details.text = it!!.data.originalTitle
        tv_desc_details.text = it!!.data.plot
        GlideHelper.loadImage(iv_top, it.data.images.snapshot)
    }

    /**
     * Error Observer
     */
    private val onErrorObserver: Observer<Event<BaseResponseModal>> = Observer { event ->
        if (event?.getContentIfNotHandled() != null) {
            Toast.makeText(this@DetailsActivity, event.peekContent().errorText, Toast.LENGTH_LONG).show()
        }
    }
}
