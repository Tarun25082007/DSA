class Solution {
    public boolean validDigit(int n, int x) {
        boolean y=false;
      int  num=0;
        while (n>0){
           num=n%10;
           if (num==x){
               y=true;
           }
            if (n<10 && num==x)
            {
                y=false;
            }
             n=n/10;                
        }
        return y;
    }
}
