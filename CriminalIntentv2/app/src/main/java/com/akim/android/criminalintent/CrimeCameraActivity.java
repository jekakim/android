package com.akim.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Alex on 1/4/2015.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
