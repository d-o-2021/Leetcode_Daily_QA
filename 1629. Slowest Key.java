class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        char ans=keysPressed.charAt(0);
        for(int i=1;i<keysPressed.length();i++)
        {
            int temp=releaseTimes[i]-releaseTimes[i-1];
            if(max<temp)
            {
                max=temp;
                ans=keysPressed.charAt(i);
            }
            if(max==temp){
                if(ans<keysPressed.charAt(i))
                {
                    ans=keysPressed.charAt(i);
                }
            }
        }
        return ans;



//trying with another approach!!!!!!! but not working correctlly ! anyone can help?
        // TreeMap<Character,Long>map=new TreeMap<>();
        // map.put(keysPressed.charAt(0),(long)releaseTimes[0]);
        // for(int i=1;i<keysPressed.length();i++)
        // {
        //     map.put(keysPressed.charAt(i),(long)((long)(map.getOrDefault(keysPressed.charAt(i),(long)0))%1000000007+(long)(releaseTimes[i]-releaseTimes[i-1])%1000000007)%1000000007);
        // }
        // System.out.println(map);
        // long max=0;char ans=' ';
        // for(Map.Entry<Character,Long> e:map.entrySet())
        // {
        //     if(max<=e.getValue())
        //     {
        //         max=e.getValue();
        //         ans=e.getKey();
        //             // System.out.println(e.getValue());  
        //     }
        // }
        // return ans;
    }
}
