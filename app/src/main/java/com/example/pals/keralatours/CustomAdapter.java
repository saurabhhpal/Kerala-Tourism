package com.example.pals.keralatours;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<LocationModel> {

    private int mColoresourceId;

    public CustomAdapter(@NonNull Context context, @NonNull List<LocationModel> objects, int resourseId) {
        super(context, 0, objects);
        mColoresourceId = resourseId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.list_item, parent, false);
        }
        LocationModel locationModel = getItem(position);
        ImageView imageView = view.findViewById(R.id.list_image);
        imageView.setImageResource(locationModel.getmImageId());

        TextView textViewDesc = view.findViewById(R.id.list_desc);
        textViewDesc.setText(locationModel.getDesc());


        TextView textView = view.findViewById(R.id.list_title);
        textView.setText(locationModel.getLocation());

        Button info_bt = view.findViewById(R.id.info_bt);
        Button dir_bt = view.findViewById(R.id.dir_bt);
        TextView title = view.findViewById(R.id.list_title);
        final String text = String.valueOf(title.getText());
        final TextView info_tv = view.findViewById(R.id.list_desc);
        info_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info_tv.getVisibility() == v.VISIBLE) {
                    info_tv.setVisibility(v.GONE);
                } else {
                    info_tv.setVisibility(v.VISIBLE);
                }


            }
        });

        dir_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + text);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                getContext().startActivity(mapIntent);
            }
        });


        View containerView = view.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), mColoresourceId);
        view.setBackgroundColor(color);
        return view;
    }
}
