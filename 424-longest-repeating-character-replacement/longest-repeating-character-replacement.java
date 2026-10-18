class Solution {
    public int characterReplacement(String s, int k) {
int c = 0 ; 
int maxf =0;
int max = 1+k;
int a[] =  new int[26];
int i=0 ,j=0;
while(j<s.length()){
     if (maxf + k >=c){
        if (max < maxf+k){
            max = maxf+k;
        }
        a[s.charAt(j) - 'A']+=1;
        if (a[s.charAt(j) - 'A']>maxf){
            maxf =a[s.charAt(j) - 'A'];
        }j++;
        c++;

     }
     else{
        a[s.charAt(i) - 'A']-=1;
        for (int l = 0 ;l<a.length;l++ ){
            if(maxf<a[l]){
                a[l]=maxf;
            }
        }
        i++;
        c--;
     }
}
 for (int l = 0 ;l<a.length;l++ ){
            if(maxf<a[l]){
                a[l]=maxf;
            }
        }
if (maxf + k >=c){
        if (max < maxf+k){
            max = maxf+k;
        }}
        if (max>s.length()){
            return s.length();
        }
return max ;
    }
}