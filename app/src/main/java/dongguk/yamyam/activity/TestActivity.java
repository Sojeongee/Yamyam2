package dongguk.yamyam.activity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import dongguk.yamyam.R;

/**
 * Created by ash on 2016-10-29.
 */
public class TestActivity extends RecyclerView.Adapter<viewholder>{
    ArrayList<ItemData> itemDatas;
    View.OnClickListener clickEvent;

    public TestActivity(ArrayList<ItemData> itemDatas, View.OnClickListener clickEvent) {
        this.itemDatas = itemDatas;
        this.clickEvent = clickEvent;
    }

    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_layout, parent,false);
        viewholder viewHolder = new viewholder(itemView);
        itemView.setOnClickListener(clickEvent);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        holder.imageView.setImageResource(itemDatas.get(position).image);
        holder.titleView.setText(itemDatas.get(position).title);
        holder.contentView.setText(itemDatas.get(position).content);
    }

    @Override
    public int getItemCount() {
        return (itemDatas != null) ? itemDatas.size() : 0;
    }
}

