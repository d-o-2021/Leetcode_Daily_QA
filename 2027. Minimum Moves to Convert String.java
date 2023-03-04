class Solution {
    public int minimumMoves(String s) {
        int count1=0;
        int count2=0;
        int i=0;
        for(i=0;i<s.length()-2;)
        {
            if(s.charAt(i)=='O')i++;
            else if(s.charAt(i)=='X'||s.charAt(i+1)=='X'||s.charAt(i+2)=='X')
            {
                count1++;
                i+=3;
            }
        }
        while(i<s.length()){
            if(s.charAt(i)=='X')
            {
                count1++;
                break;
            }
            i++;
        }
        for(i=s.length()-1;i>1;)
        {
            if(s.charAt(i)=='O')i--;
            else if(s.charAt(i)=='X'||s.charAt(i-1)=='X'||s.charAt(i-2)=='X')
            {
                count2++;
                i-=3;
            }
        }
        while(i>=0){
            if(s.charAt(i)=='X')
            {
                count2++;
                break;
            }
            i--;
        }
        return Math.min(count1,count2);
        
    }
}
