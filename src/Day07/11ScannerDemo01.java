package Day07;

import java.util.Scanner;

class ScannerDemo01 {
    public static void main (String [] args){
        //创建扫描器的对象
        Scanner sc = new Scanner(System.in);

//        System.out.println("Please input an int number");
//        //获得从控制台输入的一个整数
//        int value = sc.nextInt();
//        System.out.println(value);

        System.out.println("Please input an String");
        //获得从控制台输入的一行字符
        String line = sc.nextLine();
        System.out.println(line);
    }
}
