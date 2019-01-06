package AlgorithmTest;

public class FindMaxNumberIn1000 {

    public static void main(String[] args){
        long startTime=System.nanoTime();
        Solution("73167176531330624919225119674426574742355349194934");
        long endTime=System.nanoTime();
        System.out.println(endTime - startTime);
    }


    private static void Solution(String str){

        if (str.indexOf("1000") != -1)
        {
            System.out.println("1000");

        }else {
            String temp = "000";
            for (int i = 0; i < str.length() - 2; i++) {
                String tempString = str.substring(i, i + 3);
                int result = tempString.compareTo(temp);
                if (result >= 0) {
                    temp = tempString;
                }
            }
            System.out.println(temp);
        }
    }
}
