class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x=(coordinates.charAt(0)-'a')+1;        
        int y=coordinates.charAt(1);
        if((x+y)%2==0)return false;
        return true;
    }
}
