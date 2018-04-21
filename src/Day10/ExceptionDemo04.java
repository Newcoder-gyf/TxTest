package Day10;

//多种异常的处理
public class ExceptionDemo04  {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        divide(a, b);
        System.out.println("-------------");
    }

    public static int divide(int a, int b){
        int c = 0;
        try {

            c = a / b;
            int [] array = new int [10];
            System.out.println(array[10]);

        } catch (Exception e) {
            if (e instanceof IndexOutOfBoundsException){
                System.out.println("数组越界");
            }else{
                System.out.println("处理数学异常");
            }

        }
        System.out.println("=============");
        return c;
    }
}
