package com.feng.mvp.presenter.baseintface;

/**
 * 此处使用接口方式实现MVP分发
 * 1. 内部二个interface,dologin是用于在view层实现进而调用,进而在此接口实现类中会调用
 * 2. allthing是用于在实现类执行所需要操作后,拿到结果调用此接口方法向view层传递数据
 
创建dologin接口，把所有业务逻辑的接口都放在这里，并创建它的实现interfaceimpl（在这里可以方便地查看业务功能，由于接口可以有多种实现所以也方便写单元测试）
创建allthing接口，把所有视图逻辑的接口都放在这里，其实现类是当前的Activity/Fragment
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
