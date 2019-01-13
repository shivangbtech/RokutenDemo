package com.example.raku.rakudemoapp.views.home

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.raku.rakudemoapp.components.Event
import com.example.raku.rakudemoapp.models.BaseResponseModal
import com.example.raku.rakudemoapp.models.home.ListRow
import com.example.raku.rakudemoapp.network.ApiCallback
import com.example.raku.rakudemoapp.network.DataServiceFactory
import com.example.raku.rakudemoapp.network.ResponseHandler

class HomeViewModel : ViewModel() {

    internal var mldListRow = MutableLiveData<ListRow>()
    internal var mldError = MutableLiveData<Event<BaseResponseModal>>()

    internal fun getListRows(id: String): MutableLiveData<ListRow> {
        val apiInterface = DataServiceFactory.getInstance().rakuApi
        val call = apiInterface.getRowData(id)
        call.enqueue(ResponseHandler<ListRow>(object : ApiCallback<ListRow> {
            override fun onSuccess(t: ListRow?) {
                mldListRow.value = t as ListRow
            }

            override fun onError(responseModal: BaseResponseModal?) {
                mldError.value = Event(responseModal!!);
            }
        }))

        return mldListRow
    }

}