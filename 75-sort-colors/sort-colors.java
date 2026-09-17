class Solution {
    public void sortColors(int[] nums) {
        int low = 0 ;
        int mid = 0;
        int temp = 0 ;
        int high = nums.length - 1 ;
       while (mid <= high ){
        // if (mid < low){
        //     mid++;
        //     continue;
        // }
         if (nums[mid] == 0){
             temp = nums[low];
            nums[low]= 0;
            nums[mid] = temp;
            low++;
            mid++;
            continue;
        }
         if (nums[mid] == 2){
             temp = nums[high];
            nums[high]= 2;
            nums[mid] = temp;
            high--;
        }
         if (nums[mid] == 1 ){
             
            mid ++;
        }
        // if (nums[mid] == 0){
        //      temp = nums[low];
        //     nums[low]= 0;
        //     nums[mid] = temp;
        //     low++;
        //     continue;
        // }
        // if (nums[high] == 1){
        //      temp = nums[mid];
        //     nums[mid]= 1;
        //     nums[high] = temp ;
        //     mid++;
        //     continue;
        // }
        //   if (nums[high] == 0){
        //      temp = nums[low];
        //     nums[low]= 0;
        //     nums[high] = temp ;
        //     low++;
        //     continue;
        // }

        // if (nums[mid] == 2 ){
        //     temp = nums[high];
        //     nums[high]= 2;
        //     nums[mid] = temp ;
        //     high --;
        //     continue;
        // }   
        // if(nums[low] == 1){
        //      temp = nums[mid];
        //     nums[mid]= 1;
        //     nums[low] = temp ;
        //     mid++;
        //     continue;

        // }
        // if (nums[low] == 2){
        //         temp = nums[high];
        //     nums[high]= 2;
        //     nums[low] = temp ;
        //     high--;
        //     continue;

        // }
       }
    }
}