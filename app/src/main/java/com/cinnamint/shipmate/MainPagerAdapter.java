package com.cinnamint.shipmate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainPagerAdapter extends FragmentPagerAdapter {
    public MainPagerAdapter (FragmentManager fm) {super(fm);}

    @Override
    public int getCount() {return 4;}

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        args.putInt("position", position);

        switch(position) {
            case 0:
                IncomingFragment iFrag = new IncomingFragment();
                return iFrag;
            case 1:

            default:
                return null;
        }


    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "ble";
            default:
                return "TODO";
        }
    }

}
