package Day04;

// 函数重载目的是提高代码可读性，并且减少命名（两个方法的参数不同，参数类型不同，重载函数和返回值类型没有关系）
public class Day04_02 {
    public static void main(String args[]){
        int result = compareNumber(54, 43, 44);
        System.out.println(result + " is larger");
    }

    public static int compareNumber(int a, int b){
        return a > b ? a:b;
    }

    public static int compareNumber(int a, int b, int c){
        return compareNumber(a, b) > c ? compareNumber(a,b): c;
    }
}
