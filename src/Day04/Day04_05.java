package Day04;

public class Day04_05 {

    public static void printArray(int [][] array){
        for (int i = 0; i < 3 ; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(array [i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        int [][] array = new int [3][4];
        array [0][0] = 12;
        array [0][1] = 11;
        array [0][2] = 10;
        array [0][3] = 16;

        array [1][0] = 0;
        array [1][1] = 1;
        array [1][2] = 2;
        array [1][3] = 3;

        array [2][0] = 22;
        array [2][1] = 21;
        array [2][2] = 20;
        array [2][3] = 26;

        printArray(array);
    }
}
