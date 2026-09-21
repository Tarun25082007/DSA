class Solution {
    public int heightChecker(int[] heights) {
        int[] ary = heights.clone();
        Arrays.sort(ary);
        int count = 0 ;
        for (int i =0;i<heights.length;i++){
            if(heights[i] != ary[i]){
                count++;
            }
        }
        return count;
    }
}