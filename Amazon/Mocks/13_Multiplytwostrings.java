/*
Multiply two strings

Given two numbers as strings s1 and s2. Calculate their Product.

Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers. You don't need to specify '+' sign in the begining of positive numbers.

Example 1:

Input:
s1 = "0033"
s2 = "2"
Output:
66
Example 2:

Input:
s1 = "11"
s2 = "23"
Output:
253
*/
public static String multiplyStrings(String a, String b) 
{
    //Your code here
    java.math.BigInteger s1=new java.math.BigInteger(a);
    java.math.BigInteger s2=new java.math.BigInteger(b);
    s2=s2.multiply(s1);
    return s2.toString();
