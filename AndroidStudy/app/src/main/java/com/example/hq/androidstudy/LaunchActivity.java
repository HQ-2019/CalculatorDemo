package com.example.hq.androidstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.KeyEvent;

/**
 * Created by HQ on 16/4/19.
 */
public class LaunchActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        //3秒后进入新手引导页
//        Handler handler = new Handler();
//        Runnable updateThread = new Runnable() {
//            @Override
//            public void run() {
//                setGuideActivity();
//            }
//        };
//        handler.postDelayed(updateThread, 3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setGuideActivity();
            }
        }, 3000);
    }

    //屏蔽物理返回键
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return false;
        }

        return true;
    }

    //设置新手引导页
    public void setGuideActivity() {
//        Intent intent = new Intent(LaunchActivity.this, GuideActivity.class);
        Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_push_left_in,R.anim.anim_push_right_out);
        //关闭当前的activity
        LaunchActivity.this.finish();
    }
}
