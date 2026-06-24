class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        int l, r;
        int sum = 0; 

        for(int i = 0; i < nums.length; i++){
            l = i + 1;
            r = nums.length - 1;
            while(l < r){
                sum = nums[i] + nums[l] + nums[r];
                if(sum < 0){
                    l++;
                    continue;
                }
                if(sum > 0){
                    r--;
                    continue;
                }
                else{
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r]));
                    if(!list.contains(temp)){
                        list.add(new ArrayList<>(temp));
                    }
                    l++;
                    r--;
                }
            }
            sum = 0;
        }
        return list;
    }
}
