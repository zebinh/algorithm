/**
 * 剑指Offer，两个链表的第一个公共节点
 */

 /*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
 public class LinkLisdCommonNode {


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        
        int len1 = 0, len2=0;
        ListNode p1 = pHead1, p2 = pHead2;

        while (p1 != null) {
            len1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            len2++;
            p2 = p2.next;
        }

        p1 = pHead1;
        p2 = pHead2;
        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                p1 = p1.next;
            }
        }else {
            for (int i = 0; i < len2 - len1; i++) {
                p2 = p2.next;
            }
        }

        while (p1 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return null;

    }

 }