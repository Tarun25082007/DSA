class Solution {
    public int romanToInt(String s) {
        int num=0;
        for(int i =0;i<s.length();i++){
        switch (s.charAt(i)){
        case 'I':{
            if (i!=s.length()-1){

            if (s.charAt(1+i)=='V')
            { num+=4;
             i++;
             break;}
            else if (s.charAt(1+i)=='X'){
             num+=9;
             i++;
             break;}
              else {
             num+=1;
             break;
             }}
             num+=1;
             break;
        }
        case 'X':{if (i!=s.length()-1){
            if (s.charAt(1+i)=='L')
            { num+=40;
             i++;
             break;
            }
            else if (s.charAt(1+i)=='C')
             {num+=90; 
             i++;
             break;}
                else 
          {   num+=10;    
             break;}
        }num+=10;    
             break;}
          

        
        case 'C':{if (i!=s.length()-1){
            if (s.charAt(1+i)=='D')
             {num+=400;
             i++;
             break;
             }
            else if (s.charAt(1+i)=='M')
             {num+=900; 
             i++;
             break;
        }
             else 
          {   num+=100;    
             break;
          }}
           num+=100;    
             break;
        }
        case 'V':{
             num+=5; 
             break;          
        }
        case 'L':{
             num+=50; 
             break;          
        }
        case 'D':{
             num+=500; 
             break;          
        }
        case 'M':{
             num+=1000; 
             break;          
        }}

        
    }
    return num;
}
}
