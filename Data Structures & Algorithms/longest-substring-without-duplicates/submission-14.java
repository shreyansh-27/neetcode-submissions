class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int min = 0;
        int max = 0;
        int length = 0;

        for(int i = 0; i < arr.length; i++){
            while(set.contains(arr[i])){
                set.remove(arr[min]);
                min++;
            }

            set.add(arr[i]);
            max = Math.max(set.size(), max);
        }
        return max;
    }
}
