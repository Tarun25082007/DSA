class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder x=new StringBuilder(s.length());
        for (int i =k-1;i>=0;i--)
        {
            x.append(s.charAt(i));
        }
        for (int i = k;i<s.length();i++)
        x.append(s.charAt(i));
        return x.toString();    }
}
