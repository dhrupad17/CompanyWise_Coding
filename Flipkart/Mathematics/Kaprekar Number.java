/*
Kaprekar Number
Given a number N, find the first N Kaprekar numbers.

Kaprekar Number:
Consider an n-digit number k, square it and add the right n digits to the left  n or  n-1 digits.If the resultant sum is  k, then k is called a Kaprekar number.
For example, 9 is a Kaprekar number since 9^2=81=8+1=9.
297 is also a Kaprekar Number as 297^2=88209 =88+209=297

Example 1:

Input:
N = 3
Output: 1 9 45
Example 2:

Input:
N = 5
Output: 1 9 45 55 99
*/

class Solution {
    
    public static boolean iskaprekar(int n){
        int prod=n*n;
        String str=Integer.toString(prod);
        for(int i=1;i<str.length();i++){
            int left=Integer.parseInt(str.substring(0,i));
            int right=Integer.parseInt(str.substring(i));
            if(left+right==n && right!=0)
                return true;
        }
        return false;
    }
    public static int[] kaprekarN(int n){
        // code here
        int[] res=new int[n];
        res[0]=1;
        int count=1;
        int num=1;
        while(count<n){
            if(iskaprekar(num)){
                res[count]=num;
                count++;
            }
            num++;
        }
        return res;
    }
}