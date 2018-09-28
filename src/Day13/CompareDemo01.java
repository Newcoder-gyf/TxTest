package Day13;

public class CompareDemo01 {

    public static void main(String[] args) {

        String str01 = "abc";
        String str02 = "cba";
        //比较两个字符串，返回int
        //从第一位开始比较，比较ASCII码的差值，如果相同则比较下一位
        int isCompared = str01.compareTo(str02);
        System.out.println(isCompared);
    }
}
