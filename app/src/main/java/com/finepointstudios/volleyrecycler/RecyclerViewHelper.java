package com.finepointstudios.volleyrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by danielmalone on 2/11/16.
 */
public class RecyclerViewHelper extends RecyclerView.Adapter<RecyclerViewHelper.MyView> {

    private static final String TAG = "RecyclerViewHelper";
    public ArrayList<String> titles;

    public RecyclerViewHelper(ArrayList<String> titles) {
        this.titles = titles;
    }

    @Override
    public RecyclerViewHelper.MyView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHelper.MyView holder, int position) {
        holder.title.setText("Welcome " + titles.get(position) + "!");
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        private TextView title;
        public MyView(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
