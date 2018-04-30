package Day11;

//获取字符串
public class StringDemo05 {
    public static void main(String[] args) {
        String str01 = "helloworld";
        char c01 = str01.charAt(5);
        //返回指定索引处的字符
        System.out.println(c01);

        //查找指定字符的索引(显示第一次该字符出现的索引值)
        //返回-1 证明查找字符串不存在
        int  number01 = str01.indexOf("o");
        System.out.println(number01);
        int  number02 = str01.indexOf("or");
        System.out.println(number02);
    }
}
