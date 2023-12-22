/*
Linear Probing in Hashing

Linear probing is a collision-handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.

Given an array of integers and a hash table size. Fill the array elements into a hash table using Linear Probing to handle collisions. Duplicate elements must be mapped to the same position in the hash table while colliding elements must be mapped to the [(value+1)%hashSize] position.

Example 1:

Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {4,14,24,44}
Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
Explanation: 4%10=4. So put 4 in 
hashtable[4].Now, 14%10=4, but 
hashtable[4] is alreadyfilled so put 
14 in the next slot and so on.
Example 2:

Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {9,99,999,9999}
Output:
99 999 9999 -1 -1 -1 -1 -1 -1 9
Explanation: 9%10=9. So put 9 in 
hashtable[9]. Now, 99%10=9, but 
hashtable[9] is already filled so 
put 99 in the (99+1)%10 =0 slot so
99 goes into hashtable[0] and so on.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
        int[] res=new int[hash_size];
        int size=0;
        Arrays.fill(res,-1);
        for(int i=0;i<sizeOfArray;i++){
            if(size<hash_size){
                int j=arr[i]%hash_size;
                //linear probing
                while(res[j]!=-1 && res[j]!=-2 && arr[i]!=res[j]){
                    j=(j+1)%hash_size;
                }
                if(arr[i]!=res[j]){
                    res[j]=arr[i];
                    size++;
                }
            }
        }
        return res;
    }
}
