package Day04;

public class Day04_01 {
    public static void main(String args[]){
        int a1 = 20;
        int a2 = 20;
        int result = compareNumber(a1, a2);
        System.out.println(result + " is larger");
        compareNumberSelf(a1, a2);

    }
    public static int compareNumber(int a, int b){
        int result = 0;
        if (a > b){
            result = a ;
        }else if (a < b ){
            result = b ;
        }
        return result;
    }

    public static void compareNumberSelf(int a, int b){
        if (a > b){
            System.out.println( a + " is larger");
        }else if (a < b){
            System.out.println( b + " is larger");
        }else{
            System.out.println( a + " is equal to " + b);
        }
    }
}
