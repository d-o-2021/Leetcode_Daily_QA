class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int i=0;
        for(int k:arr2)
        {
            for(int j=i;j<arr1.length;j++)
            {
                if(k==arr1[j])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                    i++;
                }
            }
        }
        //insertion sort
        for(int j=i+1;j<arr1.length;j++)
        {
            int value=arr1[j];
            int k;
            for(k=j;k>i;k--)
            {
                if(arr1[k-1]>value)
                {
                    arr1[k]=arr1[k-1];
                }
                else
                {
                    break;
                }
            }
            arr1[k]=value;
        }
        return arr1;
        
    }
}
