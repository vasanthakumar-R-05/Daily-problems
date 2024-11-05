class Solution {
    public static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
            String sort1 = sortString(s);
            String sort2 = sortString(t);
            if(sort1.equals(sort2))
               return true;
        return false;
    }
}