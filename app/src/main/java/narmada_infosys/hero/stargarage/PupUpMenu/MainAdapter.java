package narmada_infosys.hero.stargarage.PupUpMenu;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import narmada_infosys.hero.stargarage.R;

/**
 * Created by hero on 2/19/18.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private List<Contents> contents;
    private Context mContext;

    public MainAdapter(List<Contents> contents, Context mContext) {
        this.contents = contents;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_content, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Contents con = contents.get(position);

        holder.title.setText(con.getTitle());
        holder.desc.setText(con.getDesc());
        holder.contentImage.setImageResource(con.getImg());
//        holder.relativeLayout.setBackgroundColor(con.getBackgroud_color());

        holder.callIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {

                    callBishistBro();

                } else if (position == 1) {

                    callSagarBro();

                } else if (position == 2) {

                    callRabinBro();

                }
            }
        });
    }

    private void callRabinBro() {

        try {
            if (Build.VERSION.SDK_INT > 22) {
                if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling

                    ActivityCompat.requestPermissions((Activity) mContext, new String[]{Manifest.permission.CALL_PHONE}, 101);

                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "9848781007"));
                mContext.startActivity(callIntent);

            } else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "9848781007"));
                mContext.startActivity(callIntent);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }


    private void callSagarBro() {

        try {
            if (Build.VERSION.SDK_INT > 22) {
                if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling

                    ActivityCompat.requestPermissions((Activity) mContext, new String[]{Manifest.permission.CALL_PHONE}, 101);

                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "9865616888"));
                mContext.startActivity(callIntent);

            } else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "9865616888"));
                mContext.startActivity(callIntent);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }


    private void callBishistBro() {


        try {
            if (Build.VERSION.SDK_INT > 22) {
                if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling

                    ActivityCompat.requestPermissions((Activity) mContext, new String[]{Manifest.permission.CALL_PHONE}, 101);

                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9849849525"));
                mContext.startActivity(callIntent);

            } else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9849849525"));
                mContext.startActivity(callIntent);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }




    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView contentImage;
        ImageView callIcon;
        TextView title, desc;
        RelativeLayout relativeLayout;

        public MyViewHolder(View itemView) {
            super(itemView);

            relativeLayout = itemView.findViewById(R.id.relativeLayout);
            title = itemView.findViewById(R.id.content_title);
            contentImage = itemView.findViewById(R.id.content_image);
            desc = itemView.findViewById(R.id.content_description);
            callIcon = itemView.findViewById(R.id.call_icon);


        }

    }
}
