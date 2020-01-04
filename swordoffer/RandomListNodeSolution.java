/**
 * 剑指Offer，复杂链表的复制
 */

 
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class RandomListNodeSolution {

    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) {
            return null;
        }
        RandomListNode p = pHead;

        while (p != null) {
            RandomListNode n = new RandomListNode(p.label);
            n.next = p.next;
            p.next = n;
            p = n.next;
        }

        p = pHead;
        while (p != null) {
            p.next.random = p.random == null ? null : p.random.next;
            p = p.next.next;
        }

        p = pHead;
        RandomListNode n = pHead.next;
        while (p != null) {
            RandomListNode node = p.next;
            p.next = node.next;
            node.next = p.next == null ? null : p.next.next;
            p = p.next;
        }

        return n;

    }
}