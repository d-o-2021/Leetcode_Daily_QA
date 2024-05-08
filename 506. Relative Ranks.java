class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        String ans[]=new String[score.length];
        Arrays.sort(score);
        int pos=1;
        for(int i=score.length-1;i>=0;i--){
            if(pos == 1){
                ans[map.get(score[i])]="Gold Medal";
            }else if(pos == 2){
                ans[map.get(score[i])]="Silver Medal";
            }else if(pos == 3){
                ans[map.get(score[i])]="Bronze Medal";
            }else{
                ans[map.get(score[i])]=""+pos;
            }
            pos++;
        }
        return ans;
    }
}
