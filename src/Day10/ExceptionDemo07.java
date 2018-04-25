package Day10;

import java.io.IOException;
import java.net.ServerSocket;

//编译期的异常处理
//1。向上抛出；2。自己处理
public class ExceptionDemo07 {
    public static void main(String[] args) {

    }

    public void returnVal(){
        try {
            ServerSocket ss= new ServerSocket(8888);
        } catch (IOException e) {
            System.out.println("Port has been already used");
            e.printStackTrace();
        }
    }

}
