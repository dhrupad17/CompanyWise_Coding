class MaxCircularSubarraySum{

    static int circularSubarraySum(int a[], int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        
        int maxsum=summax(a,n);
        int minsum=sum - summin(a,n);
        
        if(minsum==0)
            return maxsum;
        return Math.max(maxsum,minsum);
    }
    static int summin(int[] a,int n){
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            res=Math.min(sum,res);
            sum=Math.min(sum,0);
        }
        return res;
    }
    static int summax(int[] a,int n){
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            res=Math.max(sum,res);
            sum=Math.max(sum,0);
        }
        return res;
    }
}