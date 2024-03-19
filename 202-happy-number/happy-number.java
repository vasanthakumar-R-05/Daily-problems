class Solution {
    public boolean isHappy(int n) {
        int b=0;
        while(n!=1){
            int a=0;
            while(n>0){
                a+=(n%10) * (n%10);
                n/=10;
            }
            n=a;
            b++;
            if(b==8)
                return false;
        }
        return true;
    }
}