package com.feng.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.feng.mvp.R;
import com.feng.mvp.presenter.baseintface.baselogininterface;
import com.feng.mvp.presenter.interfaceimpl.phoneloginimpl;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity implements baselogininterface.allthing{


    private baselogininterface.dologin loginimpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }


    private void login() {
        loginimpl=new phoneloginimpl(this);
        loginimpl.login();
    }

    @Override
    public void onError(String msg) {
        Log.e("mss==",msg);
    }

    @Override
    public void onUserNameError(String msg) {
        Log.e("mss==",msg);
    }

    @Override
    public void onUserPwdError(String msg) {
        Log.e("mss==",msg);
    }

    @Override
    public void relogin(String msg) {
        Log.e("mss==",msg);
    }

}
