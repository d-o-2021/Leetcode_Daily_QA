class Solution {
    public boolean isBoomerang(int[][] points) {
      // (y2-y1)/(x2-x1)==(y'2-y'1)/(x'2-x'1)return false
//       else return true;
    return (points[0][1]-points[1][1])*(points[1][0]-points[2][0])!=(points[1][1]-points[2][1])*(points[0][0]-points[1][0]);
    }
}
