package com.cinnamint.shipmate.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamint.shipmate.Adapters.RecyclerAdapter;
import com.cinnamint.shipmate.Models.Incoming;
import com.cinnamint.shipmate.R;

import java.util.ArrayList;
import java.util.List;


public class IncomingFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerAdapter mRecyclerAdapter;


    public IncomingFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_incoming, container, false);

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.recycler1);
        List<Incoming> sample = new ArrayList<Incoming>();
        Incoming c = new Incoming();
        sample.add(c);
        sample.add(c);
        sample.add(c);
        sample.add(c);
        sample.add(c);
        sample.add(c);
        mRecyclerAdapter = new RecyclerAdapter(getActivity(), sample);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerAdapter.notifyDataSetChanged();

        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);


        return rootView;
    }
}
