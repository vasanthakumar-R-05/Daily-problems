class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int arr[]=new int[n];
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=nums1.length;i<n;i++)
        {
            arr[i]=nums2[j];
            j++;
        }
        Arrays.sort(arr);
       
        double sum=0;
        if(n%2!=0)
        {
            sum=arr[(n/2)];
          
             
        }else 
        {
            sum+=(arr[n/2-1]+arr[(n/2)])/2.0;   
        }
       if(n==1)
        {
            sum=arr[0];
        }
        return sum;
    }
}