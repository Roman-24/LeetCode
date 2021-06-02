import java.util.Collections;
import java.util.PriorityQueue;

/* Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number. */

class Solution {
    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int temp : nums) {
            pQueue.add(temp);
        }

        int max1 = pQueue.poll();
        int temp = 0;
        int max2 = 0;
        boolean flag = false;

        while(pQueue.peek()!=null){

            temp = pQueue.poll();

            if(temp!=max1)
                break;
        }

        while(pQueue.peek()!=null){

            flag = true;
            max2 = pQueue.poll();

            if(temp!=max2)
                break;
        }

        if(flag && temp!=max2)
            return max2;
        else
            return max1;

    }
}
