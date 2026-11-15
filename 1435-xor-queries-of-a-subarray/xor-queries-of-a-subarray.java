class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] x = new int[queries.length];
        for (int i = 1 ; i<arr.length ;i++){
         arr[i] = arr[i]^arr[i-1];
        }
       for (int i = 0 ; i<x.length ;i++){
        if (queries[i][0] == 0){
            x[i] = arr[queries[i][1]];
        }
        else {
            x[i] = arr[queries[i][1]]^arr[queries[i][0]-1];
        }
       }
       return x;
    }
}