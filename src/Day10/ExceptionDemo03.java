package Day10;

//运行期异常解决办法 2，向上抛出
public class ExceptionDemo03  {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        //如果发生运行期异常，后面的代码就不会执行
        //try catch 快捷键：选中目标代码， command+option+T
        try {
            divide(a, b);
        } catch (Exception e) {
             e.printStackTrace();
            System.out.println("调用者在处理异常");
        }
        System.out.println("-------------");
    }

    public static int divide(int a, int b){
        //如果执行者不自行处理，异常将会抛出给调用者
        int c = 0;
        c = a / b;
        //代码出现异常，以下代码不会执行
        System.out.println("=============");
        return c;
    }
}