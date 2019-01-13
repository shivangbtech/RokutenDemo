package com.example.raku.rakudemoapp.views.home;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.raku.rakudemoapp.R;
import com.example.raku.rakudemoapp.models.home.ListRowData;

import java.util.ArrayList;

public class OuterListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<ListRowData> dataList;
    private RecyclerView.RecycledViewPool mViewPool;
    private View.OnClickListener mOnClickListener;

    public OuterListAdapter(ArrayList<ListRowData> dataList, View.OnClickListener clickListener) {
        this.dataList = dataList;
        mViewPool = new RecyclerView.RecycledViewPool();
        mOnClickListener = clickListener;
    }

    @Override
    public ItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_outer, null);
        ItemRowHolder itemRowHolder = new ItemRowHolder(v);
        return itemRowHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        if (viewHolder instanceof ItemRowHolder) {
            ItemRowHolder holder = (ItemRowHolder) viewHolder;
            holder.tvTitle.setText(dataList.get(viewHolder.getAdapterPosition()).getName());
            holder.recycler_view_list.setAdapter(new InnerListAdapter(dataList.get(viewHolder.getAdapterPosition()).getContents().getData(), mOnClickListener));
            holder.recycler_view_list.setRecycledViewPool(mViewPool);
            holder.recycler_view_list.setNestedScrollingEnabled(false);
        }
//

         /*  itemRowHolder.recycler_view_list.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                    case MotionEvent.ACTION_UP:
                        //Allow ScrollView to intercept touch events once again.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }
                // Handle RecyclerView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    public void addItem(ListRowData listRowData) {
        if (dataList == null)
            dataList = new ArrayList();
        dataList.add(listRowData);
        notifyItemRangeChanged(dataList.size(), 1);
    }

    public class ItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;
        protected RecyclerView recycler_view_list;

        public ItemRowHolder(View view) {
            super(view);

            this.tvTitle = (TextView) view.findViewById(R.id.tv_title);
            this.recycler_view_list = (RecyclerView) view.findViewById(R.id.recycler_view_list);
            this.recycler_view_list.setLayoutManager(new LinearLayoutManager(recycler_view_list.getContext(), LinearLayoutManager.HORIZONTAL, false));
        }
    }
}