package com.example.hq.androidstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by HQ on 16/4/30.
 */
public class CalculatorActivity extends Activity implements View.OnClickListener{
    /**
     *  视图控件声明
     */
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_clear;
    Button btn_delete;
    Button btn_divide;
    Button btn_multiply;
    Button btn_minus;
    Button btn_pluse;
    Button btn_point;
    Button btn_equal;

    EditText et_showView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        /**
         * 获取视图控件
         */
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4 = (Button) findViewById(R.id.btn_4);

        btn_clear    = (Button) findViewById(R.id.btn_clear);
        btn_delete   = (Button) findViewById(R.id.btn_del);
        btn_divide   = (Button) findViewById(R.id.btn_divide);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_minus    = (Button) findViewById(R.id.btn_minus);
        btn_pluse    = (Button) findViewById(R.id.btn_pluse);
        btn_point    = (Button) findViewById(R.id.btn_point);
        btn_equal    = (Button) findViewById(R.id.btn_equal);

        et_showView = (EditText) findViewById(R.id.et_showView);

        /**
         * 设置按钮点击事件
         */
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        btn_point.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_pluse.setOnClickListener(this);
        btn_equal.setOnClickListener(this);

        btn_clear.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
    }

    /**
     * 按钮的点击事件
     * @param v 被点击的按钮对象
     */
    @Override
    public void onClick(View v) {
        //获取文本框中的内容
        String showViewText = this.et_showView.getText().toString();
        //获取按钮的文字
        String str = (String) ((Button)v).getText();
        et_showView.setText(str);
//        Intent intent = new Intent(CalculatorActivity.this, GuideActivity.class);
//        startActivity(intent);
//        overridePendingTransition(R.anim.anim_push_left_in, R.anim.anim_push_right_out);

    }

    /**
     * 获取计算结果
     */
    private void getResult() {

    }
}
