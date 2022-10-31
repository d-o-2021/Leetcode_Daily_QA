class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=arr.length-1;i>=0;i--)
        {
            int end=arr.length-1;
            if(arr[i]==0)
            {
                while(end>0&&end!=i)
                {
                    arr[end]=arr[end-1];
                    end--;
                }
            }
        }
    }
}
