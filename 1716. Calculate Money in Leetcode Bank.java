class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int days=n;
        for(int i=1;i<=(n/7+1);i++){
            for(int j=i;j<i+7&&days>0;j++){
                sum+=j;
                days--;
            }
        }
        return sum;
    }
}
