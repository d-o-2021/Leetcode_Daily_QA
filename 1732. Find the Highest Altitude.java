class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+gain[i-1];
        } 
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)max=i;
        }
        return max;
    }
}
