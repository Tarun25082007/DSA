class Solution {
    public int[] findArray(int[] pref) {
        int[] x = new int[pref.length];
    x[0] = pref[0];
    for (int i = 1; i<x.length ;i++){
        x[i] = pref[i-1] ^ pref[i];
    }
    return x;}
}