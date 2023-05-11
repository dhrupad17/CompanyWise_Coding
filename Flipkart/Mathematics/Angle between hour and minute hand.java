// Angle between hour and minute hand

/*
Calculate the angle between the hour hand and minute hand.

Note: There can be two angles between hands; we need to print a minimum of two. Also, we need to print the floor of the final result angle. For example, if the final angle is 10.61, we need to print 10.


Example 1:

Input:
H = 9 , M = 0
Output:
90
Explanation:
The minimum angle between hour and minute
hand when the time is 9 is 90 degress.
Example 2:

Input:
H = 3 , M = 30
Output:
75
Explanation:
The minimum angle between hour and minute
hand when the time is 3:30 is 75 degress.
*/

class Anglebetweenhourandminutehand{
    static int getAngle(int h , int m) {
        // code here
        float angle=(float)Math.abs((11*m-60*h)*0.5);
        if(angle>180)
            return (int)(360-angle);
        return (int)angle;
    }
};

/*
Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)
*/