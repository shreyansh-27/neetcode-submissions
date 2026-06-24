class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        for(int n: nums){
            set.add(n);
        }

        int i = 0;
        int count = 0;

        while(i < nums.length){
            int curCount = 0;
            int j = nums[i];
            while(true){
                if(set.contains(j+1)){
                    curCount++;
                    j++;
                }
                else{
                    break;
                }
            }
            if(curCount > count) {count = curCount;}
            i++;
        }
        return count+1;
    }
}
