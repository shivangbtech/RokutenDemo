package com.example.raku.rakudemoapp.models.home;

import com.example.raku.rakudemoapp.models.BaseResponseModal;
import com.google.gson.annotations.SerializedName;

public class ListRow extends BaseResponseModal {

    @SerializedName("data")
    private ListRowData listRowData;

    public ListRowData getListRowData() {
        return listRowData;
    }

    public void setListRowData(ListRowData listRowData) {
        this.listRowData = listRowData;
    }
}
