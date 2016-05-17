package com.example.kikig.playandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.layout_exam01);

        /**
         * 1. 전체를 감싸는 LinearLayout
         *  (1) LinearLayout 생성
         */
        LinearLayout mainLayout = new LinearLayout(this);

        // 수직 배치로 설정
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        // LayoutParams 정보 : 크기 설정
        FrameLayout.LayoutParams mainParam =
                new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        /**
         * 2. 첫번째 줄을 감싸는 LinearLayout
         *  (1) 첫번째 줄의 LinearLayout
         */
        LinearLayout nameLayout = new LinearLayout(this);

        // 수평 배치로 설정
        nameLayout.setOrientation(LinearLayout.HORIZONTAL);

        // LayoutParams 정보 : 크기 설정
        FrameLayout.LayoutParams nameParam =
                new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);


    }
}
