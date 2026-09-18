class Solution {
    public int trap(int[] height) {
        int i = 0 ; 
        int j = height.length -1;
        while (height[i]== 0 && i<j ){
            i++;
        }
         while (height[j]== 0 && i<j){
            j--;
        }
        int temp = Math.min(height[i],height[j]);
        int trap = Math.min(height[i],height[j]) * (j-i-1);
        if (temp == height[i]){
            i++;
        }
        else {
            j--;
        }
        while (i<j){
            if (height[i] <= temp){
                trap -= height[i];
                i++;
                continue;
            }
              if (height[j] <= temp){
                trap -= height[j];
                j--;
                continue;
            }
            if (height[i] > temp){
                trap -= temp ;
                trap += (Math.min(height[i],height[j]) - temp) * (j-i-1);
                temp = Math.min(height[i],height[j]);

            }
            else  if (height[j] > temp){
                trap -= temp ;
                trap += (Math.min(height[i],height[j]) - temp) * (j-i-1);
                temp = Math.min(height[i],height[j]);

            }
            if(temp == height[i]){
                i++;
            }
            else{
                j--;
            }
            
           
         
        }
        if (trap <=0 ){
            return 0 ;
        } 
        return trap ;

    }
}