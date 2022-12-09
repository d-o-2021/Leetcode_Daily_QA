class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1)return true;
        int arr[]=new int[26];
        int size=words.length;
        for(String i:words)
        {
            for(int j=0;j<i.length();j++)
            {
                arr[i.charAt(j)-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                if(arr[i]%size!=0)
                return false;
            }
        }
        return true;
    }
}
