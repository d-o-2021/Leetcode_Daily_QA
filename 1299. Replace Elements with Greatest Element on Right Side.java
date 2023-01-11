//I really appreciate myself to code this question,getting 0ms and faster than 100% submissions
//by my own logic
//Approach : traverse from back and start putting that maximum number to next number util another maximum number appears or not!! 
class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
        ans[arr.length-1]=-1;//last element always -1
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>0;)
        {
            i--;
            while(i>0&&max>=arr[i])
            {
                ans[i]=max;
                i--;
            }
            ans[i]=max;
            max=arr[i];
        }
        return ans;
    }
}
