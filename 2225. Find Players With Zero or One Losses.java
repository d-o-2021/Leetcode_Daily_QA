class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> winner1= new ArrayList<>();
        List<Integer> winner2= new ArrayList<>();
        Map<Integer,Integer> winner = new HashMap<>();
        Map<Integer,Integer> looser = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            looser.put(matches[i][1],looser.getOrDefault(matches[i][1],0)+1);
            winner.put(matches[i][0],winner.getOrDefault(matches[i][0],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:looser.entrySet())
        {
            if(e.getValue()==1){
                winner2.add(e.getKey());
            }
        }
        for(Map.Entry<Integer,Integer> e:winner.entrySet()){
            if(!(looser.containsKey(e.getKey()))){
                winner1.add(e.getKey());
            }
        }
        Collections.sort(winner1);
        Collections.sort(winner2);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(winner1);
        ans.add(winner2);
        return ans;
    }
}
