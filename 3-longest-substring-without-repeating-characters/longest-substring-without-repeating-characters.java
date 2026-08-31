class Solution {//3
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> x = new HashMap<>();
    if(s.length() == 0 || s.length()==1){
        int g = (s.length()==0)?0:1;
        return g;

    }
    int max=0;
    int ng=0;
    int l = 0;
    for  (int i =0; i < s.length();i++){
        if (x.containsKey(s.charAt(i))){
         if (max< l ){
            max = l;
         }   
         ng = x.get(s.charAt(i));
         x.clear();
         i=ng;
         l=0;
        }
        else {
            x.put(s.charAt(i),i);
            l++;
        }
    }
     if (max< l){
        max=l;
     }
        return max ;
    }
}