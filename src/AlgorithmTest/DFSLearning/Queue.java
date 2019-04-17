package AlgorithmTest.DFSLearning;


class ListNode{
    int value;
    ListNode next;
    public ListNode(int x){
        this.value = x;
        this.next = null;
    }
}
public class Queue {

    ListNode head = new ListNode(0);
    public void Queue(){

    }
    public void push(int x){
        if (this.isEmpty()){
            head.value = x;
        }else{
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new ListNode(x);
        }
    }
    public Integer poll(){
        if (this.isEmpty()){
            return null;
        }else {
            return head.value;
        }
    }

    public boolean isEmpty(){
        if (head.next == null){
            return true;
        }else{
            return false;
        }
    }

}
