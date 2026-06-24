class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total = 1;
        int[] arr = new int[nums.length];
        int zeroCount = 0;
        for(int num: nums){
            if(num == 0){
                zeroCount++;
                continue;
            }
            total *= num;
        }
        if(zeroCount > 1){
            return new int[nums.length];
        }

        if(zeroCount == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    arr[i] = total;
                }
                else{
                arr[i] = 0;
                }
            }
            return arr;
        }

        for(int i = 0; i < nums.length; i++){
            arr[i] = total / nums[i];
        }
        return arr;
    }
}  
