class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int curr=1;
        for(int i=0;i<s.length();i++)
        {
            if(curr%2!=0)
            {
                if(s.charAt(i)=='*')count++;
            }
            if(s.charAt(i)=='|')curr++;
        }
        return count;
    }
}
