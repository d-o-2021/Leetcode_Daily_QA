class Solution {
    public String thousandSeparator(int n) {
        String ans="";
        // 1
        // .234.567
        while((n/1000)>0)
        {
            String rem=""+n%1000;
            if(rem.length()==1)rem="00"+rem;
            else if(rem.length()==2)rem="0"+rem;
            ans="."+(rem)+ans;
            n/=1000;
        }
    return ""+n+ans;        
    }
}
