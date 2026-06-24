class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0 || s.length() == 1) return s.length();

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            char c = s.charAt(i);

            if(map.containsKey(arr[i]) && map.get(c) >= left){
                left = map.get(arr[i]) + 1;
            }

            map.put(arr[i], i);
            max = Math.max(i - left + 1, max);
        }

        return max;
    }
}
