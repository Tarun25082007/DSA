class Solution {
    public String reverseVowels(String s) {
    StringBuilder x= new StringBuilder(s);
    int i=0;
    int j=s.length()-1;
    while(i<s.length() && j>i)
    {
        if (s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U' && s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u'  )
        {
            i++;
            continue;
        }
         if (s.charAt(j)!='A' && s.charAt(j)!='E' && s.charAt(j)!='I' && s.charAt(j)!='O' && s.charAt(j)!='U' && s.charAt(j)!='a' && s.charAt(j)!='e' && s.charAt(j)!='i' && s.charAt(j)!='o' && s.charAt(j)!='u'  )
        {
            j--;
            continue;
        }
        char temp=x.charAt(i);
x.setCharAt(i, x.charAt(j)); 
x.setCharAt(j, temp);
i++;
j--;

    }
    return x.toString();
    }
}
