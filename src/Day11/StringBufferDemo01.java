package Day11;

public class StringBufferDemo01 {
    public static void main(String[] args) {
        //创建可变字符串
        StringBuffer sb01 = new StringBuffer();
        //在可变字符串后追加布尔类型的字符串
        StringBuffer sb02 = sb01.append(false);
        System.out.println(sb01 == sb02);
    }
}
