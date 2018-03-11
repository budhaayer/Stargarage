package narmada_infosys.hero.stargarage;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import narmada_infosys.hero.stargarage.PupUpMenu.Contents;
import narmada_infosys.hero.stargarage.PupUpMenu.MainAdapter;

/**
 * Created by hero on 1/3/18.
 */


public class AboutDeveloper extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View mView;
        mView = getActivity().getLayoutInflater().inflate(R.layout.about_developer, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(mView);
        return builder.create();
    }



}





