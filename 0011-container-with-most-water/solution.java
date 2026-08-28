class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i =0;
        int x=height.length-1;
        int area=0;
        int ml=0;
        while(x>i){
         ml = (height[i]>=height[x])?height[x]:height[i];
         area = ml*(x-i);
         if (area> max){
            max = area;
         }
         if (height[i]>=height[x]){
            x--;
         }else{
i++;
         }
        
        }

         return max;
    }
}
    
