package Day14;

import java.util.HashMap;

public class PokerMap {

    public static HashMap<Integer, String> BuildPokerColorMap(){
        HashMap<Integer, String> pokerColorMap = new HashMap<Integer, String>();
        pokerColorMap.put(1, "Heart");
        pokerColorMap.put(2, "Spade");
        pokerColorMap.put(3, "Diamond");
        pokerColorMap.put(4, "Club");

        return pokerColorMap;
    }

    public static HashMap<Integer, String> BuildPokerValueMap(){
        HashMap<Integer, String> pokerValueMap = new HashMap<Integer, String>();
        pokerValueMap.put(1, "A");
        pokerValueMap.put(2, "2");
        pokerValueMap.put(3, "3");
        pokerValueMap.put(4, "4");
        pokerValueMap.put(5, "5");
        pokerValueMap.put(6, "6");
        pokerValueMap.put(7, "7");
        pokerValueMap.put(8, "8");
        pokerValueMap.put(9, "9");
        pokerValueMap.put(10, "10");
        pokerValueMap.put(11, "J");
        pokerValueMap.put(12, "Q");
        pokerValueMap.put(13, "K");

        return pokerValueMap;
    }
}
