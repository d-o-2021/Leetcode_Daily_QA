import java.util.*;
class Solution {
    public int countLargestGroup(int n) {
        if(n<=9)return n;
        else
        {
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=1;i<10;i++)
            {
                map.put(i,1);
            }
            for(int i=10;i<=n;i++)
            {
                int num=i;
                int sum=0;
                while(num!=0)
                {
                    sum+=num%10;
                    num/=10;
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            ArrayList<Integer> arr=new ArrayList<>(map.values());
            Collections.sort(arr);
            System.out.println(arr);
            int data=arr.get(arr.size()-1);
            int count=0;
            for(int i:arr)if(i==data)count++;
            return count;
        }
        
    }
}
