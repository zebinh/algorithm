/**
 * ��ָOffer�������л�����ڵ�
 */


 
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

 public class EntryNodeOfListSolution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow = pHead;
        ListNode fast = pHead;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if ( slow == fast ) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        fast = pHead;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
 }