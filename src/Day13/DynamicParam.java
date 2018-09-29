package Day13;

public class DynamicParam {

    public static void main(String[] args) {

        int[] p = {1, 3, 5, 7, 2};
        System.out.println(add(p));

    }

    //不加static的方法是对象方法
    //加了static的方法是类方法
    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    /**
     * 可变参数的定义
     *
     * int ... p 参数是一个int类型的数组（同int[] p）
     *
     * */
    public static int add(int ... p){
        System.out.println(p);
        int result = 0;
        for (int element: p){
            System.out.println(element);
            result = result + element;
        }

        return result;
    }
}
