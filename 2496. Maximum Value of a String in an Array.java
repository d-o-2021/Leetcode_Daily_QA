// # Intuition
// First thought was to check each string one by one
// <!-- Describe your first thoughts on how to solve this problem. -->

// # Approach
// Second thought is to use exception handling concept to return result
// # Logic : 
// If a string contains any alphabet than it can not be converted to integer and hence if that string only contains number we return that integer otherwise we return length of string. 
// <!-- Describe your approach to solving the problem. -->

// # Complexity
// - Time complexity: O(n)
// <!-- Add your time complexity here, e.g. $$O(n)$$ -->

// - Space complexity: O(1)
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->

// # Code
class Solution {
    public int len(String s)
    {
        int i=0;
        try
        {
            i=Integer.parseInt(s);
        }
        catch(Exception e)
        {
            return s.length();
        }
        return i;
    }
    public int maximumValue(String[] strs) {
        int max=0;
        for(String s :strs)
        {
            if(max<len(s))
            {
                max=len(s);
            }
        }
        return max;
    }
}
