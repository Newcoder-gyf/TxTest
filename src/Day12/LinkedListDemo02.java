package Day12;

import java.util.LinkedList;

//LinkedList 是非线程安全的
public class LinkedListDemo02 {
    public static void main(String[] args) {

        //创建一个LinkedList
        LinkedList newList01 = new LinkedList();
        for (int i = 1 ; i <= 5; i ++){
            newList01.add("test0" + i);
        }
        //System.out.println(newList01);

        //在链表开头和末尾插入元素
        newList01.addFirst("test00");
        newList01.addLast("test06");
        System.out.println(newList01);

        //获取链表开头的元素
//        Object firtstElementNewList01 = newList01.element();
//        System.out.println(firtstElementNewList01);
//
//        Object getFirstElement = newList01.getFirst();
//        System.out.println(getFirstElement);
//        System.out.println(newList01);
//        Object getLastElement = newList01.getLast();
//        System.out.println(getLastElement);
//        System.out.println(newList01);
//
//        System.out.println(newList01.indexOf("test00"));
//        System.out.println(newList01.lastIndexOf("test05"));

        // poll = pop = pollFirst 都是出栈栈顶元素 (test00 是栈顶)
        // 直接打印list， 第一个元素就是栈顶元素
        // pollLast 出栈栈底元素
        System.out.println(newList01);
        Object pollElement = newList01.poll();
        System.out.println("poll element is: " + pollElement);
        System.out.println(newList01);

        Object popElement = newList01.pop();
        System.out.println("pop element is: " + popElement);
        System.out.println(newList01);

        Object pollFirstElement = newList01.pollFirst();
        System.out.println("pollFist element is: " + pollFirstElement);
        System.out.println(newList01);

        Object pollLastElement = newList01.pollLast();
        System.out.println("pollLast elements is: " + pollLastElement);
        System.out.println(newList01);

        newList01.push("test07");
        System.out.println(newList01);

        newList01.clear();
        for (int i = 0; i < 10; i ++){
            newList01.push("test0" + i);
        }
        System.out.println(newList01);
    }
}
