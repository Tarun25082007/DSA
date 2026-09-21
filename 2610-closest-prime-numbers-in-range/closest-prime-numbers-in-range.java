class Solution {
    public int[] closestPrimes(int left, int right) {
              
           boolean[] ary = new boolean[right+1];
           for (int i = 2 ; i*i <right+1 ; i ++){
            if (!ary[i]){
                for (long j = (long)i*i; j<right+1; j+=i){
                    ary[(int)j] = true;
                }
            }
           }
           int[] ary1 = {-1,-1};
             if (right <=2){
            return ary1 ;
        }
           int gap = Integer.MAX_VALUE;
           int prev = 0 ;int cur = 0;
           for (int i = left;i<=right ; i++){
            if(i <=1){
                continue;
            }
           
            if (prev == 0 && ary[i]== false){
                    prev = i;
            }
            else if( ary[i] == false ){
                cur=  i ;
                if ((cur - prev )<gap){
                    gap = cur - prev;
                    ary1[0] = prev;
                    ary1[1] = cur;
                     if(gap == 1 ){
                return ary1;
            }
                }
                prev = cur;
            }
           }
           return ary1;
    }
}
