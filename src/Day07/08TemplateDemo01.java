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
    public final void concreteMethod01(){}

    //模版方法
    public void templateMethod(){
        hookMethod();
        abstractMethod01();
        concreteMethod01();
    }

    /*
    * 具体的模版
    * */
    class concreteTemplate01 extends AbstractTemplate01{

        /*
        * 实现具体的业务逻辑
        * */
        public void abstractMethod01(){
            System.out.println("concrete logic");
        }

        public void hoodMethod(){
            System.out.println("override method");
        }
    }

}
