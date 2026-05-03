class Solution {
    public int myAtoi(String s) {
        if (s.length()==0)
        return 0;
double atoi=0;
int i,j=0;
        String y="0";
        for ( i = 0;i<s.length();i++)
        {
            if (s.charAt(i)!=' ')
            { j=i;
            break;}
        }
        if(s.charAt(j)=='-')
        {   j+=1;
          for (;j<s.length();j++)
        {  
           if (s.charAt(j)>='0' && s.charAt(j)<='9') 
             y+=s.charAt(j);
            else 
             break;
        }
        
         atoi=Double.parseDouble(y) * -1;}
        else
        {  for (;j<s.length();j++)
        {
            if (j==i && s.charAt(j)=='+')
             continue;
           if (s.charAt(j)>='0' && s.charAt(j)<='9') 
             y+=s.charAt(j);
            else 
             break;
        }
         atoi=Double.parseDouble(y);}
         if (atoi>Integer.MAX_VALUE)
          return(Integer.MAX_VALUE);
        else  if (atoi<Integer.MIN_VALUE)
          return(Integer.MIN_VALUE);
          else 
           return (int)atoi;
     } 
        
    }

