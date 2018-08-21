package com.example.pals.keralatours;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FixedPagetabAdapter extends FragmentPagerAdapter {

    private Context context;

    public FixedPagetabAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InsightsFragments();
            case 1:
                return new BeachFragment();
            case 2:
                return new WaterfallFragment();
            case 3:
                return new NationalParkFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:

                return context.getResources().getString(R.string.insights);
            case 1:
                return context.getResources().getString(R.string.beaches);
            case 2:
                return context.getResources().getString(R.string.waterfall);
            case 3:
                return context.getResources().getString(R.string.nationalParks);

        }
        return super.getPageTitle(position);
    }

}
