class Solution {
public:
    int compareBitonicSums(vector<int>& nums) {
        int peak_index;
        for(int i=1; i<nums.size()-1; i++) {
            if(nums[i]<nums[i-1]) {
                peak_index = i-1;
                break;
            }
        }
        long suminc=0;
        long sumdec=0;
        for(int i=0; i<=peak_index; i++) {
            suminc += nums[i];
        }
        for(int i=peak_index; i<nums.size(); i++) {
            sumdec += nums[i];
        }

        if(suminc>sumdec) 
            return 0;
        else if(sumdec>suminc)
            return 1;
        else
            return -1;
    }
};