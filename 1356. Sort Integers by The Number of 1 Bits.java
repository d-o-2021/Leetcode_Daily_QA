import java.util.*;
class Solution {
    public int count(int i)
    {
        int count=0;
        while(i!=0)
        {
            if((i&1)==1)count++;
            i>>=1;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        for(int i:arr)
        {
            int bits=count(i);
            if(map.containsKey(bits))
            {
                ArrayList<Integer> ar=map.get(bits);
                ar.add(i);
            }
            else
            {
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(i);
                map.put(bits,ar);
            } 
        }
//         System.out.println(map);
        int k=0;
        int ans[]=new int[arr.length];
        for(ArrayList<Integer> i:map.values())
        {
            int size=i.size();
            int index=0;
            while(size!=index)
            {
                ans[k++]=i.get(index++);
            }
        }
        return ans;
        }
}
