package com.example.laptop.finalproject.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.laptop.finalproject.fragments.Tab1;
import com.example.laptop.finalproject.fragments.Tab2;
import com.example.laptop.finalproject.fragments.Tab3;
import com.example.laptop.finalproject.models.Restaurant_;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    private int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created
    private Restaurant_ restaurant;


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb,
                            Restaurant_ restaurant) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
        this.restaurant = restaurant;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0)
        {
            Tab1 tab1 = new Tab1();

            tab1.receiveRestaurantId(restaurant);

            return tab1;
        }
        else if (position == 2)
        {
            Tab2 tab2 = new Tab2();

            tab2.receiveRestaurantId(restaurant);
            return tab2;
        }
        else
        {
            Tab3 tab3 = new Tab3();

            tab3.receiveRestaurantId(restaurant);
            return tab3;
        }
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }

}
