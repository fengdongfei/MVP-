# MVP-登录案例
此处demo主要是用于简单介绍MVP模式的简单实用,以登录为例子(不存在界面,主要看log日志,)通过修改phoneloginimpl类的types值模仿登录结果

###很久之前就听说过MVP模式，但是I叫懒惰，一致没有研究，今天就来尝试一下。

### 概念:MVP 指的是Model,View,Presenter(交互器/表示器)，是从经典的模式MVC演变而来，它们的基本思想有相通的地方：
    Controller/Presenter负责逻辑的处理，Model提供数据，View负责显示。
### MVP的设计原则 -- 怎么实现一个MVP设计模式？
    *1:一个 Activity对应一个 View (把activity当成MPV的view进行操作)
    *2:通常情况下，一个 View对应一个 Presenter，在业务复杂时，一个 View可对应多个 Presenter.
    *3.通常情况下将 View 与 Presenter抽象成接口。
### 通用工程目录结构(见demo)






###总结MVP与MVC优缺点
     *1：MVC允许 View 和 Model 直接通讯。
     *2：MVP 中，View和 Model 的交互都在Presenter 内部来完成
     *3：MVP 中，View 通常会抽象化出来一系列的接口。（面向接口编程）
     *4：MVP 相对于 MVC 而言，大大降低了耦合度（Activity 不再进行复杂的操作），层级更明显，更利于单元测试。
     *5：MVP 的缺点：类文件会爆炸（极具增加），有一定的学习成本。
*参考资料: http://www.cnblogs.com/android-zcq/p/5126925.html
