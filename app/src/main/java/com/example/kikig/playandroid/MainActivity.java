package com.example.kikig.playandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

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
         * 2. 첫번 째 줄을 감싸는 LinearLayout
         *  (1) 첫번 째 줄의 LinearLayout
         */
        LinearLayout nameLayout = new LinearLayout(this);

        // 수평 배치로 설정
        nameLayout.setOrientation(LinearLayout.HORIZONTAL);

        // LayoutParams 정보 : 크기 설정
        FrameLayout.LayoutParams nameParam =
                new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

        /**
         *  (2) '이름' 이라는 TextView 추가
         */
        TextView nameText = new TextView(this);

        // 이름 문자열 설정
        nameText.setText("이름");

        // LinearParams 정보 : 크기 설정
        LinearLayout.LayoutParams nameTextParam =
                new LinearLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);

        // 첫번 째 줄에 TextView 추가
        nameLayout.addView(nameText, nameTextParam);

        /**
         *  (3) 이름을 입력 할 EditText를 첫번째 줄에 추가
         */
        EditText nameEdit = new EditText(this);

        // LayoutParams 정보 : 크기 설정
        FrameLayout.LayoutParams nameEditParam =
                new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);

        // 첫번 째 줄에 EditText 추가
        nameLayout.addView(nameEdit, nameEditParam);

        /**
         *  (4) 이름을 저장 할 버튼 추가
         */
        Button nameButton = new Button(this);

        // 이름 문자열 설정
        nameButton.setText("저장");

        // LinearParams 정보 : 크기 설정
        LinearLayout.LayoutParams nameButtonParam =
                new LinearLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);

        // 첫번 째 줄에 TextView 추가
        nameLayout.addView(nameButton, nameButtonParam);

        /**
         * 3. 두번 째 줄의 종료 버튼 추가
         */
        Button exitButton = new Button(this);

        // 이름 문자열 설정
        exitButton.setText("종료");

        // LinearParams 정보 : 크기 설정
        LinearLayout.LayoutParams exitButtonParam =
                new LinearLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

        /**
         * 4. 전체를 감싸는 LinearLayout에 View 들을 추가
         */
        mainLayout.addView(nameLayout, nameParam);
        mainLayout.addView(exitButton, exitButtonParam);

        /**
         * 5. 작성한 main Layout을 화면에 포함시킨다.
         */
        setContentView(mainLayout, mainParam);
    }
}
