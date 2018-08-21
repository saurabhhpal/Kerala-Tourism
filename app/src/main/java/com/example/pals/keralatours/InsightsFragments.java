package com.example.pals.keralatours;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class InsightsFragments extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.loaction_list, container, false);

        final ArrayList<LocationModel> locationModels = new ArrayList<>();
        locationModels.add(new LocationModel(getResources().getString(R.string.beach_varkala), getResources().getString(R.string.beach_varkala_desc), R.drawable.varkala_1));
        locationModels.add(new LocationModel(getResources().getString(R.string.Athirappilly), getResources().getString(R.string.AthirappillyWaterfalls_DESC), R.drawable.athirapally_falls_thumb));
        locationModels.add(new LocationModel(getResources().getString(R.string.beach_kovalam), getResources().getString(R.string.beach_kovalam_desc), R.drawable.kovalam_1));
        locationModels.add(new LocationModel(getResources().getString(R.string.anamudiSholaNationalPark), getResources().getString(R.string.anamudiSholaNationalPark_DESC), R.drawable.anamudisholanationalpark));
        locationModels.add(new LocationModel(getResources().getString(R.string.SoochiparaWaterfalls), getResources().getString(R.string.SoochiparaWaterfalls_DESC), R.drawable.soochipara_falls_main_thumb));
        locationModels.add(new LocationModel(getResources().getString(R.string.ThommankuthuWaterfalls), getResources().getString(R.string.ThommankuthuWaterfalls_DESC), R.drawable.thummanakuthu_main_thumb));
        locationModels.add(new LocationModel(getResources().getString(R.string.VazhachalWaterfalls), getResources().getString(R.string.VazhachalWaterfalls_DESC), R.drawable.vazachal_falls_main_thumb));
        locationModels.add(new LocationModel(getResources().getString(R.string.beach_marari), getResources().getString(R.string.beach_marari_desc), R.drawable.marari_1));
        locationModels.add(new LocationModel(getResources().getString(R.string.EravikulamNationalPark), getResources().getString(R.string.EravikulamNationalPark_DESC), R.drawable.eravikulamnationalpark));
        locationModels.add(new LocationModel(getResources().getString(R.string.PeriyarNationalPark), getResources().getString(R.string.PeriyarNationalPark_DESC), R.drawable.periyarnationalpark));


        CustomAdapter customAdapter = new CustomAdapter(getActivity(), locationModels, R.color.insights);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(customAdapter);


        return rootView;
    }


}
