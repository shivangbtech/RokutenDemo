package com.example.raku.rakudemoapp.views.home

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.raku.rakudemoapp.components.Event
import com.example.raku.rakudemoapp.models.BaseResponseModal
import com.example.raku.rakudemoapp.models.movies.MovieDetails
import com.example.raku.rakudemoapp.network.ApiCallback
import com.example.raku.rakudemoapp.network.DataServiceFactory
import com.example.raku.rakudemoapp.network.ResponseHandler

class MovieViewModel : ViewModel() {

    internal var mldDetails = MutableLiveData<MovieDetails>()
    internal var mldError = MutableLiveData<Event<BaseResponseModal>>()

    internal fun getDetails(id: String): MutableLiveData<MovieDetails> {
        val apiInterface = DataServiceFactory.getInstance().rakuApi
        val call = apiInterface.getDetails(id)
        call.enqueue(ResponseHandler<MovieDetails>(object : ApiCallback<MovieDetails> {
            override fun onSuccess(t: MovieDetails?) {
                mldDetails.value = t as MovieDetails
            }

            override fun onError(responseModal: BaseResponseModal?) {
                mldError.value = Event(responseModal!!);
            }
        }))

        return mldDetails
    }
}