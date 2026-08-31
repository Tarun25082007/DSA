class Solution {
    public int hammingWeight(int n) {
        int x = 0;
        long huk = 1;
        int i = 0;
        while (huk <= n ){
            if ((huk & n) != 0){
                x ++;
            }
           huk =  huk<<1;
        }

        return x ;
        
    }
}
