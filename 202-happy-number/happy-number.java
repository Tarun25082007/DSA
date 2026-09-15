class Solution {
    public boolean isHappy(int n) {
      HashSet <Long> y = new HashSet<>();
      long check = 0;
      long x = n; 
      while(check != 1){
        check = 0 ;
        while (x>0){
         check += Math.pow(x%10, 2);
         x = x/10;
        }
        x = check ;
          if (y.contains(check)){
        return false ;
        }
         y.add(check);

      } 
      return true ;
    }
}