package com.hazemelmamlouk.publishsubjectrxjava.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hazemelmamlouk.publishsubjectrxjava.R;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.FirstFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.FourthFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.SecondFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.ThirdFragment;

public class EventBusPagerAdapter  extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[] { R.string.tab_text_1, R.string.tab_text_2 };
    private final Context mContext;

    public EventBusPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        if (position == 0) {
            return ThirdFragment.newInstance();
        } else {
            return FourthFragment.newInstance();
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
