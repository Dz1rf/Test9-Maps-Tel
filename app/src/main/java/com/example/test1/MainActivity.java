package com.example.test1;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button but1, but2, but3, but4, but5, butRez;
    TextView text1, text2, text3, text4, text5, text6;
    View view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);
        butRez = findViewById(R.id.butRez);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text3);
        text3 = findViewById(R.id.text4);
        text4 = findViewById(R.id.text5);
        text5 = findViewById(R.id.text6);
        text6 = findViewById(R.id.text7);
        view1 = findViewById(R.id.view1);


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()) {
                    case R.id.but1:
                        text2.setText(R.string.text2);
                        but1.setFocusableInTouchMode(true);
                        butRez.setText(R.string.But1);
                        butRez.setBackgroundResource(R.drawable.but1);
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com")); //создаётся переменная intent, которая запрашивает программу просмоторщик, и пытается просмотреть ссылку
                        startActivity(intent); break;
                    case R.id.but2:
                        text3.setText(R.string.text3);
                        butRez.setText(R.string.But2);
                        butRez.setBackgroundResource(R.drawable.but2);
                        intent = new Intent();                                                      //создаётся переменная intent
                        intent.setAction(Intent.ACTION_VIEW);                                       //делается запрос на поиск просмоторщика
                        intent.setData(Uri.parse("geo:-0.45609946, -90.26607513"));                 //вводятся входные данные для просмоторщика
                        startActivity(intent); break;
                    case R.id.but3:
                        text4.setText(R.string.text4);
                        butRez.setText(R.string.But3);
                        butRez.setBackgroundResource(R.drawable.but3);
                        intent = new Intent(Intent.ACTION_DIAL);                                    //создаётся переменная intent и выполняется запрос на открытие телефона
                        intent.setData(Uri.parse("tel:123456789"));                                 //в intent записываются входные данные
                        startActivity(intent); break;
                    case R.id.but4:
                        text5.setText(R.string.text5);
                        butRez.setText(R.string.But4);
                        butRez.setBackgroundResource(R.drawable.but4); break;
                    case R.id.but5:
                        text6.setText(R.string.text6);
                        butRez.setText(R.string.But5);
                        butRez.setBackgroundResource(R.drawable.but5); break;
                }
            }
        };

        but1.setOnClickListener(onClickListener);           // назначение кнопкам слушателя
        but2.setOnClickListener(onClickListener);
        but3.setOnClickListener(onClickListener);
        but4.setOnClickListener(onClickListener);
        but5.setOnClickListener(onClickListener);

        text1.setOnClickListener(new View.OnClickListener() {   // создание слушателя для текстовой кнопки
            @Override
            public void onClick (View view) {
                but5.setVisibility(View.VISIBLE);
                view1.setVisibility(View.VISIBLE);
            }
        });


    }
}