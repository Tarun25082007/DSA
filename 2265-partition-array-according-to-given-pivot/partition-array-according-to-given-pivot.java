class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //   int low = 0 ;
        //   int mid = 0;
        //   int high = nums.length - 1;
        //   int temp = 0 ;
        //   // same logic like zeros in left ,1s in middle and 2 in last 
        //   // like that onlt less to left and more to right 
        // while (mid <= high ){
        //     if ( nums[mid] > pivot){
        //         temp = nums[mid];  
        //         nums[mid] = nums[high];
        //         nums[high] = temp ;
        //         high -- ;

        //     }
        //    else if (nums[mid]<pivot){
        //          temp = nums[mid];  
        //         nums[mid] = nums[low];
        //         nums[low] = temp ;
        //         low++;
        //         mid ++;
        //     }
        //     else{
        //         mid ++;
        //     }
            

        // }
        // because this method doesnt maintain integretiy or stability
int cl = 0 ;
int cp = 0;
int cf = 0;
        for (int i =0 ;i<nums.length; i++){
         if ( nums[i] < pivot){
            cf++;
         }
        else if ( nums[i] > pivot){
            cl++;
        }
         else{
            cp++;
         }
        }
        int low = 0 ;
        int mid = cf;
        int last = nums.length - cl ;
        int[] nums1 = new int[nums.length];
         for (int i =0 ;i<nums.length; i++){
         if ( nums[i] < pivot){
            nums1[low] = nums[i];
            low++;
         }
        else if ( nums[i] > pivot){
           nums1[last] = nums[i];
           last++;
        }
         else{
            nums1[mid] = nums[i];
            mid++;
         }
        }
        return nums1; 
    }
}