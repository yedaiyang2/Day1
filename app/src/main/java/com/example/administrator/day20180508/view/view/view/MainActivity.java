package com.example.administrator.day20180508.view.view.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.day20180508.R;
import com.example.administrator.day20180508.view.view.bean.DengLuBean;
import com.example.administrator.day20180508.view.view.presenter.DengLuPersenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements DengLuView {

    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.mima)
    EditText mima;
    @BindView(R.id.denglu)
    Button denglu;
    @BindView(R.id.zhuce)
    Button zhuce;


    DengLuPersenter persenter = new DengLuPersenter(this, this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                persenter.getData(phone.getText().toString(), mima.getText().toString());

            }
        });
        zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ZhuCeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        persenter.sdasd();
    }

    @Override
    public void ben(DengLuBean bean) {
        if (bean.getMsg().length() == 4){
            Toast.makeText(MainActivity.this, bean.getMsg(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, XQActivity.class);
            startActivity(intent);
        }
        Toast.makeText(MainActivity.this, bean.getMsg(), Toast.LENGTH_SHORT).show();
    }

}
