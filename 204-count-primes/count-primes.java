class Solution {
    public int countPrimes(int n) {
        // normal method is very long time 
        // i use siere of eratos 
        boolean[] ary = new boolean[n];
        Arrays.fill(ary,true);
        for (int i = 2 ; i*i < n ; i++){
            if (ary[i] == false ){
                continue;
            }
            int j = i*i ;
            while ( j< n){
                
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