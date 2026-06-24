class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;

        while(l < r){
            int height = heights[l] < heights[r] ? heights[l] : heights[r];
            int length = r - l;
            int curMax = height * length;
            max = max > curMax ? max : curMax;

            if( heights[l] < heights[r] && (l+1) != r){
                l++;
                continue;
            }

            if( heights[r] >  heights[l] && (r - 1) != l){
                r--;
                continue;
            }

            if(heights[l] > heights[r]) r--;
            else l++;
        }
        return max;
    }
}
