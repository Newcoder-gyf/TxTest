package Day11;

import java.util.Scanner;

public class StringDemo08 {
    public static void main(String[] args){

        callMethod();

    }

    public static void callMethod(){
        try{
            getStringFunction();
        }catch(Exception e){
            callMethod();
        }
    }

    public static void getStringFunction(){
        System.out.println("Please input your string");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String head = line.substring(0,1);
        System.out.println(head.toUpperCase());

    }
}
