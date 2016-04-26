package com.cinnamint.shipmate.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cinnamint.shipmate.Models.Incoming;
import com.cinnamint.shipmate.R;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private Context mContext;

    public RecyclerAdapter(Context context, List<Incoming> items) {
        mContext = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View v) {
            super(v);
            // Define all of the components in the view
        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInf = LayoutInflater.from(mContext);
        View customView = mInf.inflate(R.layout.item_layout_incoming, parent, false);

        final ViewHolder vh = new ViewHolder(customView);

        return vh;
    }

    @Override
    public int getItemCount(){ return 6; }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Replace contents
        Toast.makeText(mContext, "D", Toast.LENGTH_LONG).show();
    }

}
