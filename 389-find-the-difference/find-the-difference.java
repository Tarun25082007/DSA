class Solution {
    public char findTheDifference(String s, String t) {
      if (t.length() == 1){
        return t.charAt(0);
      }
      Map<Character ,Integer> x = new HashMap<>();
       
        for (int i = 0 ; i < t.length();i++){
            if (x.containsKey(t.charAt(i))){
                   x.put(t.charAt(i),x.get(t.charAt(i))+1);
            }
            else {
                x.put(t.charAt(i),1);
            }
        }
          for (int i = 0 ; i < s.length();i++){
            if (x.containsKey(s.charAt(i))){
                   x.put(s.charAt(i),x.get(s.charAt(i))-1);
            }
        }
        for (char m : x.keySet()){
            if (x.get(m) == 1 ){
                return m ;
            }
        }
        return 'q';

    }
}