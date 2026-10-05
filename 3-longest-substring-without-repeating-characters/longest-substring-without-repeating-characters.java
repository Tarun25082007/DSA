class Solution {//3
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> x = new HashMap<>();
    if(s.length() == 0 || s.length()==1){
        int g = (s.length()==0)?0:1;
        return g;
    }
    int max=0;
    int ng = 0 ;
    int y = 0 ; int j = 0 ;
 while (j <s.length()){
    if (x.containsKey(s.charAt(j))){
        max = Math.max(max,j-y);
        ng = x.get(s.charAt(j))+1;
        for (int i = y;i<ng;i++ ){
            x.remove(s.charAt(i));
        }
         x.put(s.charAt(j),j);
         y = ng ;
         j++;
    }
    else {
            x.put(s.charAt(j),j);
        j++;
    }
 }
  max = Math.max(max,j-y);
        return max ;
    }
}