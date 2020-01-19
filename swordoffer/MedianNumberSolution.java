import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 剑指Offer，数据流中的中位数
 */

public class MedianNumberSolution {

    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

    public void Insert(Integer num) {
        max.offer(num);
        min.offer(max.poll());
        if (max.size() < min.size()) {
            max.offer(min.poll());
        }
    }

    public Double GetMedian() {
        if (max.size() == min.size()) {
            return (max.peek() + min.peek() ) / 2.0;
        }
        return (double)max.peek();
    }


}