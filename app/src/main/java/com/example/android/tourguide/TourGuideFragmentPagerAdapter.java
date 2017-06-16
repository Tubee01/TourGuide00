package com.example.android.tourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourGuideFragmentPagerAdapter  extends FragmentPagerAdapter {
     private Context mContext;

    public TourGuideFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext= context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DoAndSeeFragment();
        } else if (position == 1) {
            return new DiningFragment();
        } else if (position == 2) {
            return new BarsAndNightlifeFragment();
        } else{
            return new AccommodationsFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0){
            return mContext.getString(R.string.Do_and_see);
        }else if (position == 1){
            return mContext.getString(R.string.dining);
        }else if (position == 2){
            return mContext.getString(R.string.bars_nightlife);
        }else{
            return mContext.getString(R.string.accommodations);
        }
    }
}
