package com.hjs.ex_1122;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        AlertDialog.Builder dialog = new AlertDialog.Builder( AlertActivity.this);

        // alertDialog는 최대 세개의 버튼을 추가할 수 있다.

        dialog.setPositiveButton("지금할게요", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertActivity.this, "지금 평가!!",Toast.LENGTH_SHORT).show();

            }
        });

        dialog.setNegativeButton("안할래요", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertActivity.this, "안할래요!!",Toast.LENGTH_SHORT).show();
            }
        });

        // 클릭시 아무작업도 하지 않을거라면
        // 이벤트 감지자에 null을 넣어주면 된다.

        dialog.setNeutralButton("나중에", null);

        dialog.setTitle("카카오톡");
        dialog.setMessage("잘 쓰고 계신가요? \n우리 앱을 평가해주세요");

        dialog.show();

    }

    @Override
    public void onBackPressed() {
        //뒤로가기 버튼 클릭 감지 메서드
        AlertDialog.Builder back = new AlertDialog.Builder(AlertActivity.this);

        back.setTitle("앱 이름");
        back.setMessage("진짜로 종료 하시겠습니까?");

        back.setPositiveButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        back.setNeutralButton("아니요" , null);
        back.show();
    }
}
