package Day10;

public class ExceptionDemo05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a, b);
        }
        //finally 里面的代码一定会被执行， 可以用来释放一些资源
        finally {
             System.out.println("Finally is processing");
        }
        System.out.println("-------------");
    }

    public static int divide(int a, int b){
        int c = a / b;
        System.out.println("=============");
        return c;
    }
}
