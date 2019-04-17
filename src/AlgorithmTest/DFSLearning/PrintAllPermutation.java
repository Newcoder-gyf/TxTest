package AlgorithmTest.DFSLearning;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutation {
    public static void main(String[] args){
        List<Integer> result = new ArrayList();
        int[] test = {0, 1, 2, 3, 4};
        for (int i = 0; i < test.length; i++){
            result.add(test[i]);
        }
        System.out.println(result);
    }

    
}
