class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minS = Integer.MAX_VALUE;
        int min = 0;
        int sum = 0;
        for(int max = 0; max < nums.length; max++){
            sum += nums[max];
            while(sum >= target){
                minS = Math.min(minS, max - min + 1);
                sum -= nums[min];
                min++;
            }
        }
        return minS == Integer.MAX_VALUE ? 0 : minS;
    }
}