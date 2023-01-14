class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int num[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i]=arr[i];
        }
        Arrays.sort(num);
        HashMap<Integer,Integer>map=new HashMap<>();
        if(num.length>0)
        map.put(num[0],0);
        for(int i=1;i<num.length;i++)
        {
            if(!map.containsKey(num[i]))
            {
                map.put(num[i],map.get(num[i-1])+1);//main logic !!!just use previous key for continues indexing!!
            }
        }
        int k=0;
        for(int i:arr)
        {
            num[k++]=map.get(i)+1;
        }
        return num;
        // 5 9 12 12 28 37 56 80 100
        // 1 2 3  3  5 this five causes problem it should be 4 since previous two elements were same thterfore they get same rank 
    }
}
