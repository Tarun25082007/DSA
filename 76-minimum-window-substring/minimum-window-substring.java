class Solution {
    public String minWindow(String s, String t) {
      Map<Character,Integer> x = new HashMap<>();
     int count = t.length();
     int l = s.length()+1;
      for (int i = 0 ; i < t.length();i++ ){
        if (x.containsKey(t.charAt(i))){
            x.put(t.charAt(i),x.get(t.charAt(i))+1);
        }
         x.putIfAbsent(t.charAt(i),1);
      }
      int i = 0 ; int j = 0 ;
      int fi = 0;int fj=s.length();
      while (j < s.length()){ 
         if (x.containsKey(s.charAt(j))){
            x.put(s.charAt(j),x.get(s.charAt(j))-1);
            if (x.get(s.charAt(j))>=0){
            count -- ;}
        }
         j++;
        while  (count <= 0 ){
            if(j-i <= fj - fi){
                fj = j ;
                fi = i ;
                l = fj - fi ;
            }
                if (x.containsKey(s.charAt(i))){
            x.put(s.charAt(i),x.get(s.charAt(i))+1);
          
            if (x.get(s.charAt(i))>0){
  count++ ;
            } i++;
            continue ;
            
        }
        i++;
        }
         
      }
     if (l == s.length()+1){
        return "";
     }
    return s.substring(fi,fj);
    }
}