class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=""+num;
        int count=0;
        for(int i=0;i<s.length()-k+1;i++)
        {
            int temp=Integer.parseInt(s.substring(i,i+k));
            if(temp!=0&&num%temp==0)
            {
                count++;
            }
        }
        return count;
    }
}
