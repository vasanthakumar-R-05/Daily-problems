class Solution {
    public int pivotInteger(int n) {
        int ans=0;
        int a=0;
        int b=-1;
        for(int i=1;i<=n;i++)
        {
            ans+=i;
        }
        for(int i=n;i>0;i--)
        {
            a+=i;
            if(a==ans)
            {
                b=i;
                break;
            }
            ans-=i;
        }
        return b;
    }
}