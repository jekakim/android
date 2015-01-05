package com.akim.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Alex on 10/5/2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
