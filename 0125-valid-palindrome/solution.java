class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        String new1 ="";
        for (int i =0,j=s.length()-1;i<s.length() && j>=0;i++,j--)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0'&& s.charAt(i)<='9')
             new1 += s.charAt(i);
             else  if(s.charAt(i)>='A' && s.charAt(i)<='Z')
             new1 += (char)((int)s.charAt(i)+32);

             if(s.charAt(j)>='a' && s.charAt(j)<='z'  || s.charAt(i)>='0'&& s.charAt(i)<='9')
             rev += s.charAt(j);
             else  if(s.charAt(j)>='A' && s.charAt(j)<='Z')
             rev += (char)((int)s.charAt(j)+32);
             
        }
        return new1.equals(rev);
    }
}
