package Day11;

import java.util.Scanner;

public class StringDemo08 {
    public static void main(String[] args){

//        String testStr01 = "testjava";
//        System.out.println(testStr01.toUpperCase());
//
//        String testStr02 = "TESTJAVA";
//        System.out.println(testStr02.toLowerCase());
//        System.out.println(testStr01 + "+" + testStr02);
//        System.out.println(testStr01.concat("+" +testStr02));
//
//        String testStr03 = "hello world";
//        String testHead = testStr03.substring(0,1);
//        System.out.println(testHead);
//        String appendHead = testHead.toUpperCase();
//        String testTail = testStr03.substring(1);
//        System.out.println(appendHead + testTail);



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
