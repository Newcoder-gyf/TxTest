package Day11;

//the relationship of different strings
public class StringDemo03 {
    public static void main(String[] args) {
        //创建常量字符串
        String str01 = "Hello World";
        //创建字符串对象
        String str02 = new String("Hello World");
        //两个字符串对象的地址比较
        System.out.println(str01 == str02);
        //两个字符串对象的值比较
        System.out.println(str01.equals(str02));

        //判断两个常量字符串的相等关系
        String str03 = "Yang";
        String str04 = "Yang";
        System.out.println(str03 == str04);
        //如果常量字符串的值是一样的，jvm不会再在数据共享区新建常量，而是直接引用已有常量

        String str05 = "hello";
        String str06 = "world";
        String str07 = "helloworld";
        //str05 和str 06 进行拼接会产生一个新的字符串
        System.out.println(str07 == (str05+str06));
        System.out.println(str07.equals(str05+str06));
        //如果是两个没有引用的常量进行拼接，就会在常量池中寻找是否已有相同常量，如果有就不去创建新的字符串，直接进行引用
        System.out.println(str07 == "hello" + "world");
    }
}
