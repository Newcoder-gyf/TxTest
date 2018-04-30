package Day11;

public class StringDemo02 {

    public static void main(String[] args) {
        //创建一个空字符串
        String str01 = new String();
        System.out.println("str01 is: " + str01 + "-----");

        //定义一个字符数组
        byte [] bs01 =  {98,99,102,103,105,107,103};

        //以字节数组作为参数的字符串对象的创建
        String str02 = new String(bs01);
        //把字节数组中每一个数值转为ASCII码并组装成字符串；如果数值过小，并不会显示
        System.out.println("以字节数组作为参数的字符串对象的创建: " + str02);

        //第一个参数字节数组，第二个参数是从指定索引开始，第三个参数是截取长度； 注意数组不要越界
        //String str03 = new String(bs01, 5, 4);
        String str03 = new String(bs01, 5, 2);
        System.out.println("以字节数组作为参数的字符串对象的创建截取字符串: " + str03);

        //创建字符数组
        char[]cs = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str04 = new String(cs);
        System.out.println("以字符数组作为参数创建字符串: " + str04);

        String str05 = new String(cs, 3, 2);
        System.out.println("以字符数组作为参数的字符串对象的创建截取字符串: " + str05);
    }
}
