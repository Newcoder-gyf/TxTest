package Day10;

import java.io.IOException;
import java.net.ServerSocket;
//编译期的异常最好执行处理
//运行期的异常最好向上抛出
public class ExceptionDemo08 {
    public static void main(String[] args) throws IOException {
        returnVal();
    }

    public static  void returnVal() throws IOException {
        ServerSocket ss = new ServerSocket();
    }
}
