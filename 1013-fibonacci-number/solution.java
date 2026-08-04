class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if (n==1)
        {
            return 1;
        }else {
        int a,b,x;
        a=0;
        b=1;
        x=0;
        for (int i=2;i<=n;i++)
        {x=a+b;
        a=b;
        b=x;
        }
        return x;
        }
    }
}
