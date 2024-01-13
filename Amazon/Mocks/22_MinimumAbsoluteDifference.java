/*
Minimum Absolute Difference
*/
class Sol
{
    int getMinDiff(int arr[], int n) 
    {
        //code here.
        //Step 1: Find the maximum element
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        //Step 2: Find Frequency of each element
        int[] freq=new int[10005];
        // Store zero in all indexes
        for(int i = 1; i <= maxi; i++)
            freq[i] = 0;
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
            
            // If current element appears more than once 
            // then the minimum absolute difference 
            // will be 0 i.e. |arr[i] - arr[i]| 
            if(freq[arr[i]]>1)
                return 0;
        }
        int mindiff=Integer.MAX_VALUE;
        //Step 3: Checking the distance between the nearest 
        // two elements in the frequency array 
        for(int i=1;i<maxi;i++){
            if(freq[i]>0)//element is present
            {
                int count=1;
                i++;
                while(i<maxi && freq[i]==0){
                    i++;
                    count++;
                }
                mindiff=Math.min(mindiff,count);
                i--;
            }
        }
        return mindiff;
    }
}

