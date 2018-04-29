package Day11;

//常量字符串的特点：1，常量字符串不会改变

public class StringDemo01 {

    public static void main(String[] args) {
        //定义一个字符串的变量，并赋值
        String str = "abc";
        //并不是单纯的相加，而是产生了新的一个地址
        str = str + "de";
        System.out.println(str);
    }
}
