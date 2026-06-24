class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int i = 0;
        int j = 0;
        if(k == 0) return false;
        while(j < nums.length){
            if(i!= j && Math.abs(i-j) > k){
                window.remove(nums[i]);
                i++;
            }
            if(window.contains(nums[j])){
                return true;
            }
            window.add(nums[j]);
            j++;
            
            
        }
        return false;
    }
}