package Day13;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add(null);
        list.add(null);

        System.out.println(list);
    }
}
