//Square root of a number
/*
Given an integer x, find the square root of x. If x is not a perfect square, then return floor(vx).

 

Example 1:

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
Example 2:

Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
*/

class SquareRoot 
{
	long floorSqrt(long x)
	 {
		if(x==1||x==0)
		    return x;
		long low=0;
		long high=x;
		while(low<=high){
		    long mid=low+(high-low)/2;
		    long sq=mid*mid;
		    if(sq==x){
		        return mid;
		    }
		    if(sq<x){
		        low=mid+1;
		    }
		    else
		    {
		        high=mid-1;
		    }
		}
		return low-1;
	 }
}

/*
Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)
*/