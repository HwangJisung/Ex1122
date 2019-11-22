package com.hjs.ex_1122;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_show , btn1, btn2;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_show = findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 다이얼 로그를 생성한다.
                dialog = new Dialog(MainActivity.this, R.style.Dialog);
                // 생성된 다이얼로그에 디자인을 위한 레이아웃 파일을 연결
                dialog.setContentView(R.layout.dialog_layout);

                // 다이얼로그의 버튼 검색
                btn1 = dialog.findViewById(R.id.btn1);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss(); // 다이얼로그 닫기
                    }
                });


                dialog.setTitle("다이얼로그 제목");

                // 다이얼로그 취소 방지
                dialog.setCancelable(false);

                dialog.show();

            }
        });



    }
}
