package com.example.hq.androidstudy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;


/**
 * Created by HQ on 16/4/20.
 */
public class GuideActivity extends Activity implements OnCheckedChangeListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);


    }
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }
}
