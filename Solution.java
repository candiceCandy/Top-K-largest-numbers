import java.util.*;
class Solution {
    /*
     * @param nums an integer array
     * @param k an integer
     * @return the top k largest numbers in array
     */
    
    public int[] topk(int[] nums, int k) {
        // Write your code here
        int n = nums.length;
       
        Queue<Integer> maxHeap = new PriorityQueue<Integer>(n, Collections.reverseOrder());
       
        int[] result = new int[k];
        for (int i = 0; i < n; i++) {
            maxHeap.offer(nums[i]);
        }
        
        
        for ( int i = 0; i < k; i++) {
            int num = maxHeap.peek();
            maxHeap.poll();
            result[i] = num;
        }
        
        return result;
    }
    
     
};