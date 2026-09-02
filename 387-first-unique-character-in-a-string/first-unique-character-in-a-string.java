class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> x = new HashMap<>();
        Queue <Character> y = new LinkedList<>();
      int a = s.length();
      for (int i = 0 ; i<a ; i ++){
        y.add(s.charAt(i));
        if (!x.containsKey(s.charAt(i))){
        x.putIfAbsent(s.charAt(i),1);
        }
        else{
        x.put(s.charAt(i),x.get(s.charAt(i))+1);
      }}
      int m = -1;
      char check;
      for (int i = 0 ; i<a ; i ++){
        check = s.charAt(i);
        if (x.get(s.charAt(i)) == 1){
            m = i;
            break;
        }
      }
      return m ;
        
    }
}