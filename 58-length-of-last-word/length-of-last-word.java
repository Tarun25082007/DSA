class Solution {
    public int lengthOfLastWord(String s) {
        int ini = 0;
        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i) == ' '){
                continue;
            }
            else{
                ini = i;
                break;
            }
        }
        int count = 0 ;
          for (int i = ini;i>=0;i--){
            if (s.charAt(i) == ' '){
               break;
            }
            else{
               count++;
            }
        }
return count ;
        
    }
}