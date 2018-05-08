package com.example.administrator.day20180508.view.view.presenter;


import android.content.Context;

import com.example.administrator.day20180508.view.view.bean.DengLuBean;
import com.example.administrator.day20180508.view.view.model.MyDengLuModel;
import com.example.administrator.day20180508.view.view.okhttp.OnUiCallback;
import com.example.administrator.day20180508.view.view.view.DengLuView;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;

public class DengLuPersenter {
    DengLuView view;
    Context context;
    private final MyDengLuModel model;

    public DengLuPersenter(DengLuView view, Context context) {
        this.view = view;
        this.context = context;
        model = new MyDengLuModel();
    }

    public void getData(String phone, String mima) {
        model.get(phone, mima, new OnUiCallback() {
            @Override
            public void onFailed(Call call, IOException e) {

            }

            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                DengLuBean bean = gson.fromJson(result, DengLuBean.class);
                view.ben(bean);
            }
        });
    }

    public void sdasd() {
        this.view = null;
    }
}
