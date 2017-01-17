package com.feng.mvp.presenter.baseintface;

/**
 * 此处使用接口方式实现MVP分发
 * 1. 内部二个interface,dologin是用于在view层实现进而调用,进而在此接口实现类中会调用
 * 2. allthing是用于在实现类执行所需要操作后,拿到结果调用此接口方法向view层传递数据
 * Created by admin on 2017/1/17.
 */

public interface baselogininterface {

    interface dologin{
         void login();
    }

    interface allthing{
         void onError(String msg);
         void onUserNameError(String msg);
         void onUserPwdError(String msg);
         void relogin(String msg);
    }
}
