package narmada_infosys.hero.stargarage;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import narmada_infosys.hero.stargarage.PupUpMenu.Contents;
import narmada_infosys.hero.stargarage.PupUpMenu.MainAdapter;

/**
 * Created by hero on 1/3/18.
 */


public class ContactUsDialog extends DialogFragment {

    //for gridlayout in recyclerview

    private List<Contents> list = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private MainAdapter mAdapter;

    //############################

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View mView;
        mView = getActivity().getLayoutInflater().inflate(R.layout.activity_main1, null);

        //for view in recyclerview


        mRecyclerView = mView.findViewById(R.id.recycler_view);
        setUpList();

        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL));

        mAdapter = new MainAdapter(list,getContext());

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mAdapter);

        //####################################3

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(mView);
        return builder.create();
    }

    // for gridlayout in recyclerview
    private void setUpList() {


        Contents s1 = new Contents(R.drawable.bishist,"Bishisht Bhatta","+977-9849849525", Color.parseColor("#074e87"));
        list.add(s1);
        Contents s2 = new Contents(R.drawable.sagar,"Sagar Pant","+977-9865616888",Color.parseColor("#074e87"));
        list.add(s2);
        Contents s3 = new Contents(R.drawable.rabins,"Rabin Nath","+977-9848781007",Color.parseColor("#074e87"));
        list.add(s3);


    }

    //#################################

}





