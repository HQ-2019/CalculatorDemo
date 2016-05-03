package com.example.hq.androidstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btn_calculator;
    Button btn_guide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calculator = (Button) findViewById(R.id.btn_calculator);
        btn_guide      = (Button) findViewById(R.id.btn_guide);

        btn_calculator.setOnClickListener(this);
        btn_guide.setOnClickListener(this);
    }

    /**
     * 按钮的点击事件
     * @param v 被点击的按钮控件
     */
    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.btn_calculator) {
            intent = new Intent(MainActivity.this, CalculatorActivity.class);
            jumpToActivity(intent);
            return;
        }

        if (v.getId() == R.id.btn_guide) {
            intent = new Intent(MainActivity.this, GuideActivity.class);
            jumpToActivity(intent);
            return;
        }
    }

    /**
     * 跳转到指定页面
     * @param intent 指定的跳转目的
     */
    private void jumpToActivity(Intent intent) {
        startActivity(intent);
        overridePendingTransition(R.anim.anim_push_left_in,R.anim.anim_push_right_out);
    }


}
