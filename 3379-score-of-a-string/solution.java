class Solution {
    public int scoreOfString(String s) {
        int len=s.length();
        int val=0;
        if(len==1)
         {val=(int)s.charAt(0);
         return val;}
         for (int i = 0;i<s.length()-1;i++)
         {
            val += Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
         }
return val;
    }
}
