package com.example.pals.keralatours;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class BeachFragment extends Fragment {

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
        locationModels.add(new LocationModel(getResources().getString(R.string.beach_kovalam), getResources().getString(R.string.beach_kovalam_desc), R.drawable.kovalam_1));
        locationModels.add(new LocationModel(getResources().getString(R.string.beach_varkala), getResources().getString(R.string.beach_varkala_desc), R.drawable.varkala_1));
        locationModels.add(new LocationModel(getResources().getString(R.string.beach_marari), getResources().getString(R.string.beach_marari_desc), R.drawable.marari_1));
        locationModels.add(new LocationModel(getResources().getString(R.string.beach_bekal), getResources().getString(R.string.beach_varkala_desc), R.drawable.bekal));

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), locationModels, R.color.beach);
        final ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(customAdapter);


        return rootView;
    }

}
