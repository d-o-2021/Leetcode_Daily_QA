class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i[]:dominoes)
        {
            int min=Math.min(i[0],i[1]);
            int max=Math.max(i[0],i[1]);
            map.put((max*10+min),map.getOrDefault((max*10+min),0)+1);
        }
        int sum=0;
        for(int i:map.values())
        {
            // if(i<=1)sum+=1;
            // else
            sum+=i*(i-1)/2;
        }
        return sum;
        
    }
}
