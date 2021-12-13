package com.example.multiautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"부산광역시", "서울특별시", "대구광역시","서구", "중구", "남구"};

        //자동완성텍스트뷰 선언 및 대입
        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,items);
        auto.setAdapter(adapter); //뷰와 데이터 연결(어뎁터)해서 아이템 배열 내용 출력
        //멀티자동완성텍스트뷰 선언 및 대입
        MultiAutoCompleteTextView multi = (MultiAutoCompleteTextView) findViewById
                (R.id.multiAutoCompleteTextView);
        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        //쉼표(공백)으로 구분해 객체 생성 및 어뎁터 설정
        multi.setTokenizer(token);
        multi.setAdapter(adapter);
    }
}