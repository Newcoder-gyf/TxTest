package Day07;
//java.long 包下面的所有类都不要引用
class MethDemo01 {
    public static void main(String [] args){
        double pi = Math.PI;
        System.out.println(pi);
        System.out.println(Math.E);

        //取绝对值
        float absValue = Math.abs(-1.4f);
        System.out.println("Absolute value is "+absValue);

        //向上取整
        double ceilVal = Math.ceil(1.2);
        System.out.println(ceilVal);

        //向下取整（舍弃小数位）
        double floorVal = Math.floor(3.8);
        System.out.println(floorVal);
    }
}
