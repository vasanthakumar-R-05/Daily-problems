class Solution {
    public String reverseVowels(String s) {
        String v="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U' || s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               v+=s.charAt(i); 
            }
        }
        String fi="";
        int j=v.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U' || s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                fi+=v.charAt(j-1);
                j--;
            }
            else{
                fi+=s.charAt(i);
            }
        }
        return fi;
    }
}


