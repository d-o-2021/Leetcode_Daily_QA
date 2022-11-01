class Solution {
    public int gcdd(int a,int b)
    {
        // a%b=rem
        // b%rem=rem1
        // rem    
        if(b==0)return a;
        return gcdd(b,a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        int gcd=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:deck)map.put(i,map.getOrDefault(i,0)+1);
        // 1 2 3 4 4 3 2 1
        //1-3 2-3 3-2
        for(int i:map.values())gcd=gcdd(i,gcd);
        
        if(gcd>1)return true;
        return false;
        
    }
}
