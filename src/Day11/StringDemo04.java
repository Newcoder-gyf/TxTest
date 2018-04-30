package Day11;

public class StringDemo04 {

    public static void main(String[] args) {
        String str01 = "helloworld";
        //判断字符串是否以ld结尾
        System.out.println(str01.endsWith("ld"));

        //判断两个字符串是否相等
        System.out.println(str01.equals("helloworld"));
        //建议使用第二种方法，可以避免由于str01 = null 而引发的空指针异常
        System.out.println("helloworld".equals(str01));

        //常会用于验证码的校验
        String str02 = "HELLOWORLD";
        System.out.println("helloworld".equalsIgnoreCase(str01));
        System.out.println("helloworld".equalsIgnoreCase(str02));

        //判断是否包含特定字符串
        System.out.println(str01.contains("hello"));

        //判断是否以特定字符开头
        System.out.println(str01.startsWith("he"));

        //判断字符串是否是空串
        System.out.println(str01.isEmpty());
        System.out.println("".isEmpty());

        //获得字符串的长度
        System.out.println(str01.length());
    }
}
