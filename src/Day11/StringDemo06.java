package Day11;

import java.util.Scanner;

//计算一个字符串中的数字，大些字母和小写字母的数量
//把字符转换ascii 码或者直接比较字符
public class StringDemo06 {
    public static void main(String[] args) {
        //创建Scanner 对象，获得输入的对象
        System.out.println("please input the Strings");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printString(str);
    }

    public static void printString(String str){
        //遍历字符串 helloworld
        //获得字符串的长度
        int upperCount = 0;
        int lowerCount = 0;
        int number = 0;

        int length = str.length();
        for (int i = 0; i < length; i++){
            char c = str.charAt(i);
            //如果用int， 系统会将字符自动转成ascii码
            // int c = str.charAt(i)
            if(c >= 'A' && c <= 'Z'){
                upperCount ++;
            }else if (c >= 'a' && c <= 'z'){
                lowerCount ++;
            }else{
                number ++;
            }
        }

        System.out.println("upperCount is: " + upperCount);
        System.out.println("lowerCount is: " + lowerCount);
        System.out.println("number is " + number);
    }
}
