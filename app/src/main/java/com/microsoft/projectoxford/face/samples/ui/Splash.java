package com.microsoft.projectoxford.face.samples.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.microsoft.projectoxford.face.samples.R;

/**
 * Created by navin on 20-03-2018.
 */

public class Splash extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }
}
