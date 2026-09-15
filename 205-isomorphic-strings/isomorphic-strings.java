class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character , Character> x = new HashMap<>();
         Map<Character , Character> y = new HashMap<>();
        for (int i = 0 ; i < s.length();i++){
            if(x.containsKey(s.charAt(i)) && x.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            else{
                x.put(s.charAt(i),t.charAt(i));
            }
              if(y.containsKey(t.charAt(i)) && y.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            else{
                y.put(t.charAt(i),s.charAt(i));
            }
        }
         
        return true;
    }
}