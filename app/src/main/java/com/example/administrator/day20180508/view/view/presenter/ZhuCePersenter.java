package com.example.administrator.day20180508.view.view.presenter;

import android.content.Context;


import com.example.administrator.day20180508.view.view.bean.ZhuCeBean;
import com.example.administrator.day20180508.view.view.model.MyZhuCeModel;
import com.example.administrator.day20180508.view.view.okhttp.OnUiCallback;
import com.example.administrator.day20180508.view.view.view.ZhuCeView;
import com.google.gson.Gson;

import java.io.IOException;


import okhttp3.Call;

public class ZhuCePersenter {
    ZhuCeView view;
    Context context;
    private final MyZhuCeModel model;

    public ZhuCePersenter(ZhuCeView view, Context context) {
        this.view = view;
        this.context = context;
        model = new MyZhuCeModel();
    }

    public void getData(String phone2, String mima2) {
        model.getlogin(phone2, mima2, new OnUiCallback() {
            @Override
            public void onFailed(Call call, IOException e) {

            }

            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                ZhuCeBean bean = gson.fromJson(result, ZhuCeBean.class);
                view.zhuce(bean);
            }
        });
    }

    public void sd() {
        this.view = null;
    }
}
