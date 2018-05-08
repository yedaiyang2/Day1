package com.example.administrator.day20180508.view.view.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.day20180508.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class XQActivity extends AppCompatActivity {
    @BindView(R.id.fanhui)
    TextView fanhui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xq);
        ButterKnife.bind(this);
        fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
