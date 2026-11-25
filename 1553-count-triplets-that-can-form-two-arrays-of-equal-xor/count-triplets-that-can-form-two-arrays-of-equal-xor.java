class Solution {
    public int countTriplets(int[] arr) {
        if (arr.length<2){
            return 0 ;
        }
        int count = 0 ;
     HashMap<Integer ,Integer> x = new HashMap<>();
     //1 stores count
      HashMap<Integer ,Integer> y = new HashMap<>();
      //another stores the sum of indices 
      x.put(0,1);
      y.put(0,-1);
      if (arr[0] == 0){
  x.put(0,2);
      }
      else {
         x.put(arr[0],1);
         y.put(arr[0],0);

      }
    for (int i = 1 ;i<arr.length ; i++){
           arr[i] = arr[i] ^ arr[i-1];
        if(x.containsKey(arr[i]) ){
             count += i*x.get(arr[i]) - x.get(arr[i])  -y.get(arr[i]);
            x.put(arr[i],x.get(arr[i])+1);
            y.put(arr[i],y.get(arr[i])+i);
            
        }
        else 
        {
             x.put(arr[i],1);
            y.put(arr[i],i);
        }
       
    }
    return count ;
    }
}