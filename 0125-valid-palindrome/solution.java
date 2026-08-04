class Solution {
    public boolean isPalindrome(String s) {
       boolean x=true;
       int i=0,j=s.length()-1;
       while(i<=j){
       char I=s.charAt(i);
       char J=s.charAt(j);
       
        if ((s.charAt(i)>'Z'|| s.charAt(i)<'A') && (s.charAt(i)>'z'|| s.charAt(i)<'a')&&(s.charAt(i)<'0'|| s.charAt(i)>'9'))
        {
            i++;
            continue;
        }
        else if (s.charAt(i)<='Z'&& s.charAt(i)>='A'){
            I+=32;
        }
        if((s.charAt(j)>'Z'|| s.charAt(j)<'A') && (s.charAt(j)>'z'|| s.charAt(j)<'a') &&(s.charAt(j)<'0'|| s.charAt(j)>'9') ){
            j--;
            continue;
        }
         else if (s.charAt(j)<='Z'&& s.charAt(j)>='A'){
            J+=32;
        }
    
        if(I!=J){
            x=false;
            break;
        }
        
         i++;j--;
       }
       return x;
    }
}
