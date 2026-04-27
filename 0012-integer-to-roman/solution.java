class Solution {
    public String  intToRoman(int num) {
        StringBuilder s=new StringBuilder();
        int lengthk =num/1000;
        int lengthh =(num-(lengthk*1000))/100;
        int lengtht=(num-((lengthk*1000)+(lengthh*100)))/10;
        int lengtho=(num-((lengthk*1000)+(lengthh*100)+(lengtht*10)));
        while(lengthk>0)
         {s.append("M");
         lengthk--;}
          while(lengthh>0)
          {
            if(lengthh==9 || lengthh==4 || lengthh==5)
             {if (lengthh==9)
                 {s.append("CM");
                 break;}
               else if (lengthh==4)
                    {s.append("CD");
                 break;} 
                else
                    {s.append("D");
                 break;} 
             }
          else   if(lengthh>5)
                 {s.append("D");
                 lengthh-=5;}
            else if (lengthh<5)
                {s.append("C");
                 lengthh-=1;}
          }

           while(lengtht>0)
          {
            if(lengtht==9 || lengtht==4 || lengtht==5)
             {if (lengtht==9)
                 {s.append("XC");
                 break;}
               else if (lengtht==4)
                    {s.append("XL");
                 break;} 
                else
                    {s.append("L");
                 break;} 
             }
           else if(lengtht>5)
                 {s.append("L");
                 lengtht=lengtht-5;}
            else if(lengtht<5)
                {s.append("X");
                 lengtht-=1;}
          }


    while(lengtho>0)
          {
            if(lengtho==9 || lengtho==4 || lengtho==5)
             {if (lengtho==9)
                 {s.append("IX");
                 break;}
               else if (lengtho==4)
                    {s.append("IV");
                 break;} 
                else
                    {s.append("V");
                 break;} 
             }
            else if(lengtho>5)
                 {s.append("V");
                 lengtho-=5;}
            else if (lengtho<5)
                {s.append("I");
                 lengtho-=1;}
          }


          String ret = s.toString();
          return ret;

          
         

    }
}
