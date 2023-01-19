class Solution {
    public String decodeMessage(String key, String message) {
        char arr[]=new char[26];
        char ch='a';
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)==' ')continue;
            else
            {
                if(arr[key.charAt(i)-'a']=='\u0000')
                {
                arr[key.charAt(i)-'a']=ch;
                ch++;
                }
            }
        }
        String ans="";
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)!=' ')
            ans+=arr[message.charAt(i)-'a'];
            else ans+=' ';
        }
        return ans;
    }
}
