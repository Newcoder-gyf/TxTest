package Day11;

public class StringDemo07 {
    public static void main(String[] args) {
        String str = "helloworld";
        //从指定索引处查找字符出现的索引(包含起始索引本身)
        int index = str.indexOf("ll", 5 );
        System.out.println(index);

        //获取字符串的子字符串 包括索引后面的字符串
        String subStr01 = str.substring(4);
        System.out.println(subStr01);

        //根据开始和结束的索引来获得子字符串 包括开始索引，不包括结束索引
        String subStr02 = str.substring(2,5);
        System.out.println(subStr02);

        //获得字符串对应的字节数组
        byte [] bs = str.getBytes();
        for (int i = 0; i < bs.length; i ++){
            System.out.println(bs[i]);
        }

        //获得字符串对应的char数组
        char [] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i ++){
            System.out.print(cs[i] + "\t");
            System.out.println();
        }

        //把布尔型字符串转化成字符串类型
        String strBoolean = String.valueOf(true);
        System.out.println(strBoolean);
    }
}
