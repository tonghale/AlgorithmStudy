package com.dscl.jianzhioffer;

import java.util.LinkedList;
import java.util.Queue;

/*剑指 Offer 59 - II. 队列的最大值
 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 */
public class Offer59_2 {
    Queue<Integer> queue;
    LinkedList<Integer> max;
    /*MaxQueue*/
    public Offer59_2() {
        queue = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        if(max.isEmpty()) return -1;
        else return max.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!max.isEmpty() && max.getLast() < value){
            max.removeLast();
        }
        max.add(value);
    }

    public int pop_front() {
        if(!queue.isEmpty()){

            if(queue.peek().equals(max.getFirst())){
                max.removeFirst();
            }
            return queue.poll();
        }
        else {
            return -1;
        }
    }
}
