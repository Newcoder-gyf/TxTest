package Day07;
/*
* 抽象模版
* （里面有三个方法 ）
*
* */
abstract class AbstractTemplate01 {

    /*
    * 必须要实现的业务方法
    * */
    public abstract void abstractMethod01();

    /*
    * 定义一个可以重写也可以不重写的方法
    * */
    public void hookMethod(){};

    //定义一个必须不能被重写的方法
    public final void concreatMethod(){}

    //模版方法
    public void templateMethod(){
        hookMethod();
        abstractMethod01();
        concreatMethod();
    }

    /*
    * 具体的模版
    * */



}
