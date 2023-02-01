class Solution {
    public int minTimeToType(String word) {
        char prev='a';
        int count=0;
        for(char i:word.toCharArray())
        {
            int min=Math.min(Math.abs(i-prev),(26-Math.abs(prev-i)));
            count+=min;
            count++;
            prev=i;
        }
        return count;
    }
}
