/*
Roman Number to Integer


Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3

Expected Time Complexity: O(|S|), |S| = length of string S.
Expected Auxiliary Space: O(1)
*/
class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        int ans = 0;
        HashMap<Character,Integer> h = new HashMap<>(8);
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i > 0 && h.get(ch) > h.get(str.charAt(i - 1))){
                ans += h.get(ch) - 2 * h.get(str.charAt(i - 1));
            }else {
                ans += h.get(ch);
            }
        }
        return ans;
    }
}