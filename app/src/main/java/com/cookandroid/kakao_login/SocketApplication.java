package com.cookandroid.kakao_login;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class SocketApplication extends Application {
    private static SocketApplication instance;
    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
        KakaoSdk.init(this, getString(R.string.kakao_app_key));
    }
}
