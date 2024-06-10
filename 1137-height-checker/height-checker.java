class Solution {
    public int heightChecker(int[] h) {
        int arr[]=new int[h.length];
        for(int i=0;i<h.length;i++)
        {
            arr[i]=h[i];
        }
        Arrays.sort(h);
        int c=0;
        for(int i=0;i<h.length;i++)
        {
            
                if(arr[i]!=h[i])
                {
                    c++;
                }
            
        }
        
        return c;
    }
}