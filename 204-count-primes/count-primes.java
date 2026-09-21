class Solution {
    public int countPrimes(int n) {
        // normal method is very long time 
        // i use siere of eratos 
        boolean[] ary = new boolean[n];
        Arrays.fill(ary,true);
        for (int i = 2 ; i < Math.sqrt(n) ; i++){
            if (ary[i] == false ){
                continue;
            }
            int j = i ;
            while ( j< n){
                if(j== i){ j+=i;
                    continue;
                    
                }
                ary[j] = false ;
                j+=i;

            }
        }
        int count = 0 ;
        for (int i = 2 ; i < n ; i++){
               if (ary[i] == true ){
                count++;
               }
        }
        return count ;
    }
}