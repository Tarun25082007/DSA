class NumArray {
int[] x;
    public NumArray(int[] nums) {
        x = new int[nums.length+1];
        x[0] = 0 ;
        for(int i = 1 ; i <= nums.length;i++){
            x[i] = x[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
       if (left==0){
        return x[right+1];}
        else {
            return x[right+1] - x[left];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */