class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 1;
        if(k == 0) return false;
        for( i = 0; i < nums.length;){
            if(j >= nums.length) return false;
            if(Math.abs(i-j) > k){
                i++;
                j = i+1;
            }
            if(nums[i] == nums[j] && Math.abs(i-j)<= k){
                return true;
            }
            j++;
            
        }
        return false;
    }
}