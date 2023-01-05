class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int compare=arr[s.charAt(0)-'a'];
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                if(arr[i]!=compare)return false;
            }
        }
        return true;
    }
}
