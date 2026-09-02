class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <=0){
            return false;
        }
        int count  = 0;
        long huk = 1 ;
        
        while (huk<=n){
            if ((n&huk) != 0){
                count++;
            }
          if (count > 1){
            return false;
          }
         huk = huk<<1;
        }
        return true;
    }
}