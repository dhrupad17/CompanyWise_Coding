/*
Mean And Median of Array

Input: a[] = {1, 3, 4, 2, 6, 5, 8, 7}
Output: Mean = 4.5, Median = 4.5
Explanation: Sum of the elements is 1 + 3 + 4 + 2 + 6 + 5 + 8 + 7 = 36, Mean = 36/8 = 4.5
Since number of elements are even, median is average of 4th and 5th largest elements, which means Median = (4 + 5)/2 = 4.5

Input: a[] = {4, 4, 4, 4, 4}
Output: Mean = 4, Median = 4 
*/
class MM
{
    
  public int median(int A[],int N)
    {
      
    
       
       //Your code here
       //If median is fraction then conver it to integer and return
       Arrays.sort(A);
       if(N%2!=0)
            return A[N/2];
        else
            return (int)(Math.floor((A[(N-1)/2]+A[N/2])/2));
        
       
    }
    
    public int mean(int A[],int N)
    {
       //Your code here
       int sum=0;
       for(int i=0;i<N;i++){
           sum+=A[i];
       }
       return (int)(Math.floor(sum/N));
    }

}

