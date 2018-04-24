package Day10;

public class ExceptionDemo06 {
    public static void main(String[] args) {
        int i = returnVal();
        System.out.println("The result of i is: " + i);
    }

    public static int returnVal(){
        int i = 0;
        int a = 9;
        try {
            i = 1;
            a = a / i;
            return i;
        } catch (Exception e) {
            i = 2;
            //执行了return 之后， i的返回值就保留下来了， return 之后的finally 并不能改变i的值（finally 里面还有return的话可以再次修改）
            return i;
        } finally {
            i = 3;
            System.out.println("Finally is processing");
            //return i;

        }
    }
}
