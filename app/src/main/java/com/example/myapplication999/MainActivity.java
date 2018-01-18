package com.example.myapplication999;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by Дима on 30.11.2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {


    EditText etNum1;
    EditText etNum2;

    Button btnSl;
    Button btnVich;
    Button btnYm;
    Button btnDel;
    Button btnClear;
    Button btnQuit;

    TextView tvResault;

    String oper = "";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Находим элементы

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btnSl = (Button) findViewById(R.id.btnSl);
        btnVich = (Button) findViewById(R.id.btnVich);
        btnYm = (Button) findViewById(R.id.btnYm);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnQuit = (Button) findViewById(R.id.btnQuit);

        tvResault = (TextView) findViewById(R.id.tvResault);

        //Прописываем обработчик
        btnSl.setOnClickListener(this);
        btnVich.setOnClickListener(this);
        btnYm.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnClear.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;

        if (TextUtils.isEmpty(etNum1.getText().toString())) {
            return;
        }
        //Заполняем переменные
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        //Нажатие кнопок
        switch (v.getId()) {
            case R.id.btnSl:
                oper = "+";
                res = num1 + num2;
                break;
            case R.id.btnVich:
                oper = "-";
                res = num1 - num2;
                break;
            case R.id.btnYm:
                oper = "*";
                res = num1 * num2;
                break;
            case R.id.btnDel:
                oper = "/";
                res = num1 / num2;
                break;


        }
        tvResault.setText(num1 + " " + oper + num2 + "=" + res);
        switch (v.getId()) {
            case R.id.btnClear:
                etNum1.setText("");
                etNum2.setText("");
                tvResault.setText("");
                break;

        }


    }

    public void Click(View view) {
        finish();

    }
}
























