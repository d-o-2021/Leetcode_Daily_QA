class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int arr[]=new int[26];
        for(int i=0;i<brokenLetters.length();i++)
        {
            arr[brokenLetters.charAt(i)-'a']++;
        }
        int count=0;
        for(String s:text.split(" "))
        {
            boolean flag=true;
            for(int i=0;i<s.length();i++)
            {
                if(arr[s.charAt(i)-'a']!=0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            count++;
        }
        return count;
    }
}
