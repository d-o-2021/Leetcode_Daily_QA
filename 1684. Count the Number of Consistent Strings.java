class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int arr[]=new int[26];
        for(int i=0;i<allowed.length();i++)
        {
            arr[allowed.charAt(i)-'a']=1;
        }
        for(String s:words)
        {
            int i;
            for(i=0;i<s.length();i++)
            {
                if(arr[s.charAt(i)-'a']!=1)break;
            }
            if(i>=s.length())
            count++;
        }
        return count;
    }
}
