/*
Intuition
Store frequency of each number and create new array according to freq.

Approach
Created a map which stores frequencies of each number and used priority queue of type Map.Entry
case 1 : to create min heap by comparing values of map entry using comparator while adding map entry and
case 2 : if same frequency number occurs we use another case of comparator for decreasing order acc. to question.

Complexity
Time complexity: O(size of array)
Space complexity: used hashmap and priority queue
Code
*/
import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q=new PriorityQueue<>((a,b)->
        {
            if(a.getValue()-b.getValue()==0)
            {
                return b.getKey()-a.getKey();
            }
            return a.getValue()-b.getValue();
        });
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            q.add(e);
        }
        for(int i=0;i<nums.length;)
        {
            if(q.size()>0)
            {
                Map.Entry<Integer,Integer> e=q.remove();
                int count=e.getValue();
                int key=e.getKey();
                while(count!=0)
                {
                    nums[i]=key;
                    i++;
                    count--;
                }
            }
        }
        return nums;
    }
}
