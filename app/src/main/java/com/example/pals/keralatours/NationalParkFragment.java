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

public class NationalParkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
   ;



    public NationalParkFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.loaction_list , container, false);

        final ArrayList<LocationModel> locationModels = new ArrayList<>();
        locationModels.add(new LocationModel(getResources().getString(R.string.anamudiSholaNationalPark), getResources().getString(R.string.anamudiSholaNationalPark_DESC), R.drawable.anamudisholanationalpark));
        locationModels.add(new LocationModel(getResources().getString(R.string.EravikulamNationalPark), getResources().getString(R.string.EravikulamNationalPark_DESC), R.drawable.eravikulamnationalpark));
        locationModels.add(new LocationModel(getResources().getString(R.string.PeriyarNationalPark), getResources().getString(R.string.PeriyarNationalPark_DESC), R.drawable.periyarnationalpark));

        CustomAdapter customAdapter = new CustomAdapter(getActivity() , locationModels ,R.color.forest);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(customAdapter);


        return rootView;
    }

}
