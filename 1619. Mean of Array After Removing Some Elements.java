class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int a=(int)((0.1)*arr.length);
        double ans=0;
        for(int i=a/2;i<(arr.length-(a/2));i++)
        {
            ans+=arr[i];
        }
        return ans/(arr.length-a);
    }
}
