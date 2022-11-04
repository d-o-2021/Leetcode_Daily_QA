class Solution {
    public int countCharacters(String[] words, String chars) {
        int ch[]=new int[26];
        for(char ch1:chars.toCharArray())
        {
            ch[ch1-'a']++;
        }
        int count=0;
        for(String s:words)
        {
            boolean flag=true;
            int temp[]=new int[26];
            for(int i=0;i<s.length();i++)
            {
                if(++temp[(s.charAt(i)-'a')]>ch[s.charAt(i)-'a'])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                count+=s.length();
            }
        }
        return count;
    }
}
