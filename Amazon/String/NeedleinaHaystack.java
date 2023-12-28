/*
Needle in a Haystack

Given 2 strings needle and haystack. Return the index of the first occurrence of needle in haystack. If needle is not part of haystack return -1. If needle is empty return 0.

Example 1:

Input:
haystack = geeksforgeeks
needle = geeks
Output: 0
Example 2:

Input:
haystack = hellolola
needle = lola
Output: 5
*/
class Sol
{
    public static int NeedleinHaystack(String haystack, String needle) 
    {
        //code here.
        return haystack.indexOf(needle);
    }
}