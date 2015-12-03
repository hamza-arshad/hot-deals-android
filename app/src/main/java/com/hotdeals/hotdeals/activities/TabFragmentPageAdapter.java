package com.hotdeals.hotdeals.activities;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by confiz-2349 on 08/11/15.
 */
public class TabFragmentPageAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 5;
    private String tabTitles[] = new String[] { "Deals", "Categories", "Favourite", "Nabeel", "Hamza" };
    private Context context;

    public TabFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0) {
            return new DealsActivity();
        }
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
