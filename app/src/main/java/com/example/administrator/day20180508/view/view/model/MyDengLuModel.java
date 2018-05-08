package com.example.administrator.day20180508.view.view.model;



import com.example.administrator.day20180508.view.view.okhttp.OkHttp3Utils;

import java.util.HashMap;

import okhttp3.Callback;

public class MyDengLuModel implements DengLuModeol {
    @Override
    public void get(String phone, String mima, Callback callback) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", phone);
        map.put("password",mima);
        OkHttp3Utils.doPost("http://120.27.23.105/user/login",map,callback);
    }
}
