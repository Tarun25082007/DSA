class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=strs[0].length();
        for (int i=0;i<strs.length;i++)
      {  if (strs[i].length()<min)
         min=strs[i].length();}
      int i=0;
      int j=0;
       if (min==0)
        return "";
       while(j<min)
        {      if(i==strs.length-1)
               {i=0;
               j++;
               continue;}
            if (strs[i].charAt(j)==strs[i+1].charAt(j))
             {i++;}
            else 
             {break;}
        } 
        if (j==0)
        return "";
        else 
        return strs[0].substring(0,j);
    }
}
