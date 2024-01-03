class Solution {
    public int numberOfBeams(String[] bank) {
        int countOne[]=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1')count++;
            }
            countOne[i]=count;
        }
        int ans=0;
        int i=0;int j=1;
        while(i<bank.length-1 && j<bank.length){
            if(countOne[i]==0){
                i++;
                j=i+1;
            }
            else {
                if(countOne[j]==0){
                    j++;
                }
                else{
                    ans+=countOne[i]*countOne[j];
                    i=j;
                    j=i+1;
                }
            }
        }
        return ans;
    }
}
