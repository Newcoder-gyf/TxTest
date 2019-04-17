package AlgorithmTest.DFSLearning;

import java.util.HashMap;
import java.util.Map;

public class FinaAllCombinations {

    Map<Character, Integer> map = new HashMap<>();
    static int[] coins = new int[]{25, 10, 5, 1};

    public void FindCombination(int money_left, int level, int[] solu){
        if (level == 3){
            solu[level] = money_left;
            System.out.println(solu);
        }

        for (int i = 0; i * coins[level] <= money_left; i++){
            solu[level] = i;
            FindCombination(money_left - i * coins[level], level + 1, solu);
        }
    }
}
