class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] visited){
        visited[node]=1;
        for(Integer i:adjLs.get(node)){
            if(visited[i]==0)
            dfs(i,adjLs,visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adjLs.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        int visited[]=new int[isConnected.length];
        int ans=0;
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0){
                ans++;
                dfs(i,adjLs,visited);
            }
        }
        return ans;
    }
}
