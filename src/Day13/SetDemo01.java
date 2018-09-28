package Day13;

import java.util.HashSet;
import java.util.Set;

/**
 * Set 特点：
 * 无序性
 * 不可重复
 * 允许有null（只能有1个）
*/
public class SetDemo01 {

    public static void main(String[] args) {

        Set<String> newSet01 = new HashSet<String>();
        newSet01.add("test01");
        newSet01.add("test02");
        newSet01.add("test03");
        newSet01.add("test04");
        newSet01.add("test05");

        System.out.println(newSet01);

        newSet01.add("test01");
        System.out.println(newSet01);
        newSet01.add(null);
        System.out.println(newSet01);
        newSet01.add(null);
        System.out.println(newSet01);
    }
}
