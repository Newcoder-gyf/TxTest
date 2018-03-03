package Day07;
/*
* 利用接口计算周长和面积
*
*
* */

interface Calinter04{
    //定义计算面积和周长的方法
     public double getArea(double r);
     public double getLength(double r);

     //定义圆周率的常量
    public final static double PI = 3.14;
}
//定义一个圆类
class Circle04 implements Calinter04{
    private double r;

    public Circle04(double r){
        this.r = r;
    }
    //提供对外访问半径的方法
    public double getR(){
        return r;
    }

    public double getArea(double r){
        return r*r*PI;
    }
    public double getLength(double r){
        return 2*r*PI;
    }
}
//定义一个正方形类
class Rect04 implements Calinter04{
     private double r;

     public Rect04(double r){
         this.r = r;
     }
     public double getR(){
         return r;
     }
     public double getArea(double r){
         return r*r;
     }
     public double getLength(double r){
         return 4*r;
     }
}

class InterDemo04 {
    public static void main(String[] args){
        Circle04 c = new Circle04(4);
        //计算面积(需要获得半径)
        double Area1 = c.getArea(c.getR());
        double Length1 = c.getLength(c.getR());
        System.out.println("the circle's area is " + Area1);
        System.out.println("the circle's length is " + Length1);

        Rect04 r = new Rect04(4);
        double Area2 = r.getArea(r.getR());
        double Length2 = r.getLength(r.getR());
        System.out.println("the Rect's area is " + Area2);
        System.out.println("the Rect's ;length is " + Length2);
    }
}
