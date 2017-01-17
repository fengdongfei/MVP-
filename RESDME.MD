###很久之前就听说过MVP模式，但是I叫懒惰，一致没有研究，今天就来尝试一下。
##概念
# MVP 指的是Model,View,Presenter(交互器/表示器)，是从经典的模式MVC演变而来，它们的基本思想有相通的地方：
    Controller/Presenter负责逻辑的处理，Model提供数据，View负责显示。
# MVP的设计原则 -- 怎么实现一个MVP设计模式？
    *1:一个 Activity对应一个 View (把activity当成MPV的view进行操作)
    *2:通常情况下，一个 View对应一个 Presenter，在业务复杂时，一个 View可对应多个 Presenter.
    *3.通常情况下将 View 与 Presenter抽象成接口。
# 通用工程目录结构(见demo)


#后记
以上就是我的MVP模式的一点理解，在MVVM模式还没有成熟的现在，我觉得没有比MVP模式更好的替代品了。当然今天写的只是MVP的基础使用，
介绍的实例项目也非常简单，看不出MVP的优势，后面还会针对MVP模式写一些日志，就目前能想到的至少包括

Android常规的开发模式经常被称为MV模式（Model-View），引入数据绑定后的MVVM模式（Model-View-ViewModel），与MVP模式的区别
目前我们写ListView的Adapter都喜欢把它写成一个内部类，如果有两个Activity里要用同一个Adapter就比较难了，通过MVP模式，能轻松地复用Adapter（你说已经不用ListView了，这不是重点不是么( ˃◡˂ )）
MVP模式需要多写许多新的接口，这也是其缺点所在，经过一段时间的实战，我自己已有一种优化的MVP模式，我会试着总结一下，把她拿出来说说



#总结MVP与MVC优缺点
     *1：MVC允许 View 和 Model 直接通讯。
     *2：MVP 中，View和 Model 的交互都在Presenter 内部来完成
     *3：MVP 中，View 通常会抽象化出来一系列的接口。（面向接口编程）
     *4：MVP 相对于 MVC 而言，大大降低了耦合度（Activity 不再进行复杂的操作），层级更明显，更利于单元测试。
     *5：MVP 的缺点：类文件会爆炸（极具增加），有一定的学习成本。
#参考资料: http://www.cnblogs.com/android-zcq/p/5126925.html
			https://segmentfault.com/a/1190000003927200
			http://kaedea.com/2015/10/11/android-mvp-pattern/
			
			