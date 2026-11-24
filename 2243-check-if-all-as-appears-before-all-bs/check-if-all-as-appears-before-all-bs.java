class Solution {
    public boolean checkString(String s) {
        int a = -1;
        int b=s.length();
        for(int i =0;i<s.length();i++){
            if (s.charAt(i) == 'a'){
                a = i;
            }
            if (s.charAt(i) == 'b' && b == s.length()){
                b = i;
            }
        }
        if (a<b){
            return true;
        }
        return false;
    }
}