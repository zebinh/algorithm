import java.util.List;

/**
 * ��ָoffer, ��β��ͷ��ӡ����
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