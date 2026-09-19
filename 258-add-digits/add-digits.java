class Solution {
    public int addDigits(int num) {
       
        int n = num;
        int sum = 0 ;
        while(num>=10){
           while(n>0){
            sum+= n%10;
            n = n/10;
           }
           num=sum;
           n=num;
           sum=0;
        }
        return num;
    }
}