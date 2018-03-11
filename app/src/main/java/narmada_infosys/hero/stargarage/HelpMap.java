package narmada_infosys.hero.stargarage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.View;

/**
 * Created by hero on 1/3/18.
 */


public class HelpMap extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View mView;
        mView = getActivity().getLayoutInflater().inflate(R.layout.help_map, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(mView);
        return builder.create();
    }



}





