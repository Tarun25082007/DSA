class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] x = new int[encoded.length+1];
        x[0] = first;
        for (int i =0 ;i<encoded.length ;i++){
            x[i+1]=x[i]^encoded[i];
        }
        return x;
    }
}