class Solution {
    public int reverse(int x) {
        long rev=0;
        if (x>=0){
            while(x>0){
                rev=(x%10)+rev*10;
                x=x/10;
            } 
        }
        else
        {
            x=x*-1;
             while(x>0){
                rev=(x%10)+rev*10;
                x=x/10;
            }
            rev=rev*-1;

        }
        int rev2 =(int) rev;
        long y=(long) rev2;
if (y==rev)
return rev2;
else 
return 0;
        
    }
}
