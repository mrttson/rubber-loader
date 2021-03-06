package com.greenfrvr.rubberloader.sample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenfrvr.rubberloader.RubberLoaderView;
import com.greenfrvr.rubberloader.interpolator.PulseInverseInterpolator;
import com.greenfrvr.rubberloader.sample.R;

import butterknife.Bind;

/**
 * Created by greenfrvr
 */
public class ModeSampleFragment extends BaseFragment {

    @Bind(R.id.loader1) RubberLoaderView loaderView1;
    @Bind(R.id.loader2) RubberLoaderView loaderView2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample_mode, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loaderView1.startLoading();
        loaderView2.setInterpolator(new PulseInverseInterpolator());
        loaderView2.startLoading();
    }
}
