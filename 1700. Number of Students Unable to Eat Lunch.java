// Intuition
// First thought was that yeah we can use stack and queue as per the question and just proceed as per the problem instruction to get the result.
// But, according to the we can see that order os sandwiches can not be altered but we can alter order of students so we must need to follow the sandwiches order to allot them to students.

// Approach
// we count number of students who eats sandwiches 1 and similarly count students who eats 0 and while following the sandwiche order we can check if that sandwich can we picked by any student or not if picked than decrease that student count if not than return student who's count is greater than 0

// Complexity
// Time complexity:O(n),n : length of array students/sandwiches
// Space complexity: Constant
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // sandwiches : 1 0 0 0 1 1
        // students   : 1 1 1 0 0 1
        // count : 1-4
        // count : 0-2
        int count1=0;
        int count0=0;
        for(int i=0;i<students.length;i++)
        {
            if(students[i]==1)count1++;
            else count0++;
        }
        for(int i=0;i<sandwiches.length;)
        {
            if(sandwiches[i]==1)
            {
                if(count1>0)//if student is available give that sandwich and proceed further
                {
                    count1--;
                    i++;
                }
                else //i.e no student is present hence return result 
                {
                    return count0;
                }
            }
            else
            {
                if(count0>0)
                {
                    count0--;
                    i++;
                }
                else
                {
                    return count1;
                }
            }
        }
        return 0;
    }
}
