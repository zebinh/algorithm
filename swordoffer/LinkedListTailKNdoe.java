/**
 * 剑指Offer，链表中倒数第K个节点
 */

 /*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
 public class LinkedListTailKNode {

    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null || k <=0) {
            return null;
        }

        ListNode fastPointer = head;
        for (int i = 0; i < k - 1; i++) {
            if (fastPointer.next != null) {
                fastPointer = fastPointer.next;
            }else{
                return null;
            }
            
        }

        ListNode slowPointer = head;
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }
 }