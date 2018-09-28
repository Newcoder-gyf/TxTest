package Day12;

import java.util.ArrayList;

//增强的for循环
public class AdvancedForLoopDemo {

    public static void main(String[] args) {

        ArrayList<String> newArrayList01 = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            newArrayList01.add("test0" + i);
        }
    }
}
