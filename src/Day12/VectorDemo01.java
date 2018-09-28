package Day12;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo01 {

    public static void main(String[] args) {

        Vector newVector01 = new Vector();
        for (int i = 0; i < 5; i ++){
            newVector01.add("test0" + i);
        }

        //获得vector 中的每一个元素
        Enumeration elementNewVector01 = newVector01.elements();
        while (elementNewVector01.hasMoreElements()){
            Object elementInVector01 = elementNewVector01.nextElement();
            if (elementInVector01.equals("test03")){
                newVector01.add("testElement");
            }
            System.out.println(elementInVector01);
        }
    }
}
