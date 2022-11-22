class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String s1:words)
        {
            if(s.indexOf(s1)==0)count++;
        }
        return count;
    }
}
