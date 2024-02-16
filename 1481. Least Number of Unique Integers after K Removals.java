import java.util.*;
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Collection<Integer> values = map.values(); 
        ArrayList<Integer> array = new ArrayList<>(values); 
        Collections.sort(array);
        int count=0;
        // 3 
        for(int i:array){
            if(k==0)break;
            if(k<i)break;
            else {
                k-=i;
                count++;

            }
        }
        return array.size()-count;
    }
}
