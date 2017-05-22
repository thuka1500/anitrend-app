package com.mxt.anitrend.adapter.pager.index;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mxt.anitrend.view.index.fragment.CompletedMangaFragment;
import com.mxt.anitrend.view.index.fragment.DroppedMangaFragment;
import com.mxt.anitrend.view.index.fragment.OnHoldMangaFragment;
import com.mxt.anitrend.view.index.fragment.PlanToReadFragment;
import com.mxt.anitrend.view.index.fragment.ReadingFragment;

import java.util.Locale;

/**
 * Created by Maxwell on 12/23/2016.
 */

public class MyMangaPageAdapter extends FragmentStatePagerAdapter {

    private static final int pages = 5;
    private int user_id;

    public MyMangaPageAdapter(FragmentManager manager, int id) {
        super(manager);
        user_id = id;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return ReadingFragment.newInstance(user_id);
            case 1:
                return PlanToReadFragment.newInstance(user_id);
            case 2:
                return OnHoldMangaFragment.newInstance(user_id);
            case 3:
                return CompletedMangaFragment.newInstance(user_id);
            case 4:
                return DroppedMangaFragment.newInstance(user_id);
        }
        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return pages;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        Locale locale = Locale.getDefault();
        switch (position)
        {
            case 0:
                return "Reading".toUpperCase(locale);
            case 1:
                return "Plan To Read".toUpperCase(locale);
            case 2:
                return "On Hold".toUpperCase(locale);
            case 3:
                return "Completed".toUpperCase(locale);
            case 4:
                return "Dropped".toUpperCase(locale);
        }
        return null;
    }
}