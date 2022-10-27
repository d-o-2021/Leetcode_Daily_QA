class Solution {
    public int[] diStringMatch(String s) {
        Deque<Integer> q=new LinkedList<>();
        for(int i=0;i<s.length()+1;i++)q.add(i);
        int arr[]=new int[s.length()+1];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[i]=q.remove();
            }
            else if(s.charAt(i)=='D')
            {
                arr[i]=q.removeLast();
            }
        }
        arr[s.length()]=q.remove();
        return arr;
    }
}
