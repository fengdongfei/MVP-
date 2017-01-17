package com.feng.mvp.presenter.interfaceimpl;


import com.feng.mvp.presenter.baseintface.baselogininterface;

/**
 * Created by admin on 2017/1/17.
 */

public class phoneloginimpl implements baselogininterface.dologin{
    private  baselogininterface.allthing allthings;
    private int types=1;

    public phoneloginimpl(baselogininterface.allthing allthing) {
        this.allthings=allthing;
    }

    @Override
    public void login() {
        switch (types){
            case 0://onError
                allthings.onError("msg: 访问网络错误");
                break;
            case 1://onUserNameError
                allthings.onUserNameError("msg: 用户名错误");
                break;
            case 2://onUserPwdError
                allthings.onUserPwdError("msg: 密码错误");
                break;
            case 3:
                allthings.relogin("msg: 重新登录");
                break;
        }
    }

}
