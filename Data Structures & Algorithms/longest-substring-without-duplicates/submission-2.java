class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0 || s.length() == 1) return s.length();

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int curLen = 0;
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                i = map.get(arr[i]);
                map.clear();
                max = Math.max(curLen, max);
                curLen = 0;
                continue;
            }

            map.put(arr[i], i);
            curLen++;
        }

        return Math.max(max, curLen);
    }
}
