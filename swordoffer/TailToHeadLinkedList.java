import java.util.List;

/**
 * 剑指offer, 从尾到头打印链表
 */

public class TailToHeadLinkedList {

    ArrayList<Integer> intList = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
        if (listNode == null) {
            return intList;
        }
        

        printListFromTailToHead(listNode.next);
        intList.add(listNode.val);
        return intList;
    }
}