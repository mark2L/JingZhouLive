package com.mark.jingzhoulive.startover;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.mark.jingzhoulive.R;
import com.mark.jingzhoulive.base.BaseAcivity;
import com.mark.jingzhoulive.databinding.ActivityStartoverBinding;


/**
 * Created by markdw on 18/5/8.
 */

public class StartoverActivity extends BaseAcivity {
    private ActivityStartoverBinding startoverBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startoverBinding= DataBindingUtil.setContentView(this, R.layout.activity_startover);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Glide.with(this).load(R.drawable.bg_initiate).into(startoverBinding.ivStart);
    }

}
