package com.example.landofgods;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HillStationFragment();
        } else if (position == 1) {
            return new TopCusineFragment();
        } else if (position == 2) {
            return new TrekAndAdventureFragment();
        } else {
            return new PilgrimageFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hill_station);
        } else if (position == 1) {
            return mContext.getString(R.string.top_cusine);
        } else if (position == 2) {
            return mContext.getString(R.string.trek_adventure);
        } else {
            return mContext.getString(R.string.pilgrimages);
        }
    }
}
