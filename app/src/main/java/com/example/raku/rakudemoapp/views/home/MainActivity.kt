package com.example.raku.rakudemoapp.views.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.example.raku.rakudemoapp.R
import com.example.raku.rakudemoapp.base.BaseActivity
import com.example.raku.rakudemoapp.components.Event
import com.example.raku.rakudemoapp.models.BaseResponseModal
import com.example.raku.rakudemoapp.models.home.ListRow
import com.example.raku.rakudemoapp.views.Navigator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private lateinit var mHomeViewModel: HomeViewModel
    private lateinit var adapter: OuterListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mHomeViewModel = ViewModelProviders.of(this@MainActivity).get(HomeViewModel::class.java)
        handleObserver()
        handleUI()
    }

    override fun onStart() {
        super.onStart()
        var idList: ArrayList<kotlin.String> = ArrayList()
        idList.add("populares-en-taquilla")
        idList.add("estrenos-para-toda-la-familia")
        idList.add("estrenos-imprescindibles-en-taquilla")
        idList.add("estrenos-espanoles")
        idList.add("si-te-perdiste")
        idList.add("especial-x-men")
        idList.add("nuestras-preferidas-de-la-semana")
        for (id: String in idList) {
            mHomeViewModel.getListRows(id)
        }
    }

    /**
     * Method call to initialize observer
     */
    private fun handleObserver() {
        mHomeViewModel.mldListRow.observe(this, mListRowObserver)
        mHomeViewModel.mldError.observe(this@MainActivity, onErrorObserver)
    }

    /**
     * Method call to handle UI
     */
    private fun handleUI() {
        adapter = OuterListAdapter(null, onItemClick)
        recycler_view_home.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view_home.adapter = adapter
    }

    /**
     * Item click listener
     */
    var onItemClick = View.OnClickListener {
        Navigator.instance.navigateToDetails(this@MainActivity, it.getTag(R.id.movies) as String)
    }

    /**
     * Row data observer
     */
    private val mListRowObserver: Observer<ListRow> = Observer {
        adapter.addItem(it!!.listRowData)
    }

    /**
     * Error Observer
     */
    private val onErrorObserver: Observer<Event<BaseResponseModal>> = Observer { event ->
        if (event?.getContentIfNotHandled() != null) {
            Toast.makeText(this@MainActivity, event.peekContent().errorText, Toast.LENGTH_LONG).show()
        }
    }
}
