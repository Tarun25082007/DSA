class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1]!=9)
          { digits[digits.length-1]+=1;
           return digits;}
    else{
        boolean x=true;
        int y=0;
       for (int i =digits.length-1;i>=0;i--)
         {  if (digits[i]!=9)
          {   x=false;
              y=i;
             break;}}
        if (x)
       {   int[] array=new int[digits.length+1];
         array[0]=1;
         return array;}
         else {
            for (int i =digits.length-1;i>y;i--)
           {  digits[i]=0;}
           digits[y]+=1;
           return digits;
         }

    }
    }}
