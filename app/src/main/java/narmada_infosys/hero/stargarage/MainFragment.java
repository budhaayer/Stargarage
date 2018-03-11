package narmada_infosys.hero.stargarage;


import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.jgabrielfreitas.core.BlurImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private FragmentManager mainfragmentManager;
    private View view;
    private ImageView myImage;
    private BlurImageView blurImageView;
    private Button getDirection, contactUs;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        // Inflate the layout for this fragment

        getDirection = view.findViewById(R.id.get_direction);
        contactUs = view.findViewById(R.id.contact_us);

        blurImageView = view.findViewById(R.id.myBlurImages);
        blurImageView.setBlur(1);

        getDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map_intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(map_intent);
            }
        });

        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ContactUsDialog fragment = new ContactUsDialog();
                mainfragmentManager = getFragmentManager();
                fragment.show(getFragmentManager(), "contact_us");

            }
        });


        return view;
    }

}
