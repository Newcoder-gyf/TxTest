package Day10;

//处理异常的两种方式：1，自行解决；2，向上抛出
// 自行解决
public class ExceptionDemo02  {
    public static void main(String[] args) {
        //有一些异常jvm能够提前预见
        //ServerSocket ss = new ServerSocket(8888);
        int a = 10;
        int b = 0;
        //如果发生运行期异常，后面的代码就不会执行
        int c = divide(a, b);
        System.out.println("------------");
        System.out.println(c);
    }

    public static int divide(int a, int b){
        //如果发生运行期异常，后面的代码就不会执行
        int c = 0;
        try{
            //如果下一行代码发生异常，JVM会创建出ArithmeticException 实例并且传给catch 变量 "e"
            c = a / b;
            //如果在try中发现了异常，异常后面的语句不会执行，会直接运行catch里面的代码
            System.out.println("发生异常的下一句代码");
        }catch (ArithmeticException e){
            System.out.println("There is an Error, need to be solved ");

            //把异常打印出来 getMessage
            String msg = e.getMessage();
            System.out.println("msg: " + msg);

            //把异常打印出来 printStackTrace
            System.out.println("********");
            e.printStackTrace();
            System.out.println("********");

            //把异常打印出来 toString
            //打印出具体的异常类和异常信息
            System.out.println("+++++++++++");
            String st = e.toString();
            System.out.println("st: "+st);
        }
        return c;
    }
}
