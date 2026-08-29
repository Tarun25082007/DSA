class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0 ){
            return false;
        }
        Stack <Character> x = new Stack<>();
        for (int i =0;i<s.length();i++){
            if (x.isEmpty()){
                x.push(s.charAt(i));
            }
          else if  (s.charAt(i)== ']' || s.charAt(i)== ')' || s.charAt(i)== '}' ){
            if (x.peek() == (char)s.charAt(i)-1 && s.charAt(i)== ')'){
                x.pop();
            }
            else if(x.peek() == (char)s.charAt(i)-2 ){
                  x.pop();
            }
            else{
            return false;
            }
          }
            
            else{
              x.push(s.charAt(i));
            }
        }
        return x.isEmpty();
    }
}
