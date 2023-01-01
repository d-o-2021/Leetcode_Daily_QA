class Solution {
    public int secondHighest(String s) {
        int arr[]=new int[10];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')arr[s.charAt(i)-'0']=1;
        }
        int count=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==1)
            {
                count++;
                if(count==2)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
