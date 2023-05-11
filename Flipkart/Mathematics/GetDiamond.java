// Get the Diamond

/*
A Diamond is present at the Nth step. The Geek wants to get this diamond and become rich, but he can jump either K steps or 1 step at a time. Find the minimum number of jumps required in order to get the diamond.

Example 1:

Input:
N = 4
K = 3
Output:
2
Explanation:
First jump of K = 3 steps and second of 1 step.
Example 2:

Input:
N = 2
K = 5
Output:
2
Explanation:
Two jumps of 1 step each.
*/

class GetDiamond{
    long findJumps(long n, long k){
        //Write your code here
        if(k>n)
            return n;
        if(k==n)
            return 1;
        if(k<n){
            long count=0;
            long temp=n/k;
            n=n%k;
            count=temp+n;
            return count;
        }
        return -1;
    }

/*
Expected Time Complexity: O(1)
Expected Space Complexity: O(1)
*/
