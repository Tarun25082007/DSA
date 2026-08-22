class Solution {
    public boolean checkDivisibility(int n) {
      long sum = 0;
       long product=1;
       int x = n ;
       while (x>0){
           sum+=x%10;
           product*=x%10;
           x=x/10;
       }
        if (n%(sum+product)==0){
            return true;
        }
        else {
            return false;
        }
    }
}
