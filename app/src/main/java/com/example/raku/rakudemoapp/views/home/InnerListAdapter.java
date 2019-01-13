package com.example.raku.rakudemoapp.views.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.raku.rakudemoapp.R;
import com.example.raku.rakudemoapp.helper.GlideHelper;
import com.example.raku.rakudemoapp.models.home.Contents;

import java.util.List;

public class InnerListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Contents.Data> itemsList;
    private View.OnClickListener mOnClickListener;

    public InnerListAdapter(List<Contents.Data> itemsList, View.OnClickListener clickListener) {
        this.itemsList = itemsList;
        mOnClickListener = clickListener;
    }

    @Override
    public InnerListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_innner, null);
        InnerListHolder mh = new InnerListHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        if (viewHolder instanceof InnerListHolder) {
            InnerListHolder holder = (InnerListHolder) viewHolder;
            holder.tvTitle.setText(itemsList.get(viewHolder.getAdapterPosition()).getTitle());
            GlideHelper.loadImage(holder.ivThumb, itemsList.get(viewHolder.getAdapterPosition()).getImages().getArtwork());
            holder.itemView.setTag(R.id.movies, itemsList.get(viewHolder.getAdapterPosition()).getId());
        }
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class InnerListHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;
        protected ImageView ivThumb;

        public InnerListHolder(View view) {
            super(view);

            this.tvTitle = (TextView) view.findViewById(R.id.tv_title);
            this.ivThumb = (ImageView) view.findViewById(R.id.iv_thumb);

            view.setOnClickListener(mOnClickListener);
        }
    }
}