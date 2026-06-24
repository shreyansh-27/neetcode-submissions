class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int left_max = 0;
        int right_max = 0;
        int sum = 0;

        while(left <= right){

            if(left_max <= right_max){
                sum += (left_max - height[left] ) > 0 ? (left_max - height[left] ) : 0;
                left_max = Math.max(left_max, height[left]);
                left++;
            }

            if(right_max < left_max){
                sum += (right_max - height[right]) > 0 ? (right_max - height[right]) : 0;
                right_max = Math.max(right_max, height[right]);
                right--;
            }
            
        }

        return sum;
    }
}
