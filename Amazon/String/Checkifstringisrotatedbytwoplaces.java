/*
Check if string is rotated by two places

Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

Example 1:

Input:
a = amazon
b = azonam
Output: 
1
Explanation: 
amazon can be rotated anti-clockwise by two places, which will make it as azonam.
Example 2:

Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 
0
Explanation: 
If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.

Expected Time Complexity: O(N).
Expected Auxilary Complexity: O(N).
Challenge: Try doing it in O(1) space complexity.
*/
class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        //Case1:Different length
        if(str1.length()!=str2.length())
            return false;
        //Case 2 if str1 length is less than 2
        if(str1.length()<2){
            if(str1.equals(str2))
                return true;
            return false;
        }
        //Case 3: Rotate 1st 2 element
        StringBuilder sb1=new StringBuilder(str1);
        String startElem=sb1.substring(0,2);
        sb1.delete(0,2);
        sb1.append(startElem);
        if(str2.equals(sb1.toString()))
            return true;
            
        //Case 4: Rotate last 2 element
        StringBuilder sb2=new StringBuilder(str1);
        String lastElem=sb2.substring(str1.length()-2);
        sb2.delete(sb2.length()-2,sb2.length());
        sb2.insert(0,lastElem);
        if(str2.equals(sb2.toString()))
            return true;
            
        return false;
        
    }
    
}