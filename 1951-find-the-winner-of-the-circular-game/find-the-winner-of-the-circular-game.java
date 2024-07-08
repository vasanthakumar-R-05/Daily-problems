class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        int rc=0;
        for(int i=0;i<n;i++)
        {
            li.add(i+1);
            
        }
        while(li.size()>1)
        {
            for(int j=0;j<li.size();j++)
            {
                if(li.size()==1)
                {
                    break;
                }
                rc++;
                if(rc==k)
                {
                    li.remove(j);
                    j--;
                    rc=0;
                }
            }
        }
        return li.get(0);
    }
}