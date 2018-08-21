package com.example.pals.keralatours;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class WaterfallFragment extends Fragment {
    public WaterfallFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.loaction_list, container, false);

        final ArrayList<LocationModel> locationModels = new ArrayList<>();
        locationModels.add(new LocationModel(getResources().getString(R.string.Athirappilly) ,getResources().getString(R.string.AthirappillyWaterfalls_DESC ), R.drawable.athirapally_falls_thumb ));
        locationModels.add(new LocationModel(getResources().getString(R.string.VazhachalWaterfalls) ,getResources().getString(R.string.VazhachalWaterfalls_DESC ), R.drawable.vazachal_falls_main_thumb ));
        locationModels.add(new LocationModel(getResources().getString(R.string.SoochiparaWaterfalls) ,getResources().getString(R.string.SoochiparaWaterfalls_DESC ), R.drawable.soochipara_falls_main_thumb ));
        locationModels.add(new LocationModel(getResources().getString(R.string.ThommankuthuWaterfalls) ,getResources().getString(R.string.ThommankuthuWaterfalls_DESC ), R.drawable.thummanakuthu_main_thumb ));

        CustomAdapter customAdapter = new CustomAdapter(getActivity() , locationModels ,R.color.waterfall);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(customAdapter);

        return  rootView;
    }


}
