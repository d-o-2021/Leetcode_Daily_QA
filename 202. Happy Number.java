class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1&&!set.contains(n))
        {
            set.add(n);
            int temp=n;
            int num=0;
            while(temp>0)
            {
                int rem=temp%10;
                temp/=10;
                num+=rem*rem;
            }
            n=num;
        }
        return n==1;
    }
}
