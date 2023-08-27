class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i:stones)
        {
            map.put(i,new HashSet<>());
        }
        map.get(stones[0]).add(1);

        for(int i=0;i<stones.length;i++){
            int currStone=stones[i];
            HashSet<Integer> jumps=map.get(stones[i]);
            for(int jump:jumps)
            {
                int newStone=currStone+jump;
                if(newStone==stones[stones.length-1])return true;
                if(map.containsKey(newStone))
                {
                    if(jump-1>0)
                    map.get(newStone).add(jump-1);
                    map.get(newStone).add(jump);
                    map.get(newStone).add(jump+1);
                }
            } 
        }
        return false;
    }
}
