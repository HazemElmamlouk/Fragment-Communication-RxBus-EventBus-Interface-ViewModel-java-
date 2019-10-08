package com.hazemelmamlouk.publishsubjectrxjava.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hazemelmamlouk.publishsubjectrxjava.R;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.FifthFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.FirstFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.SecondFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.SexthFragment;

public class ViewModelPagerAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[] { R.string.tab_text_1, R.string.tab_text_2 };
    private final Context mContext;

    public ViewModelPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        if (position == 0) {
            return FifthFragment.newInstance();
        } else {
            return SexthFragment.newInstance();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}