class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)return true;
        for(int i=1;i<coordinates.length-1;i++)
        {
            if((coordinates[i][1]-coordinates[i-1][1])*(coordinates[i+1][0]-coordinates[i][0])==
            (coordinates[i][0]-coordinates[i-1][0])*(coordinates[i+1][1]-coordinates[i][1]))
            {
                continue;
            }
            else return false;
        }
        return true;
    }
}
