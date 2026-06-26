class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> str1 = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            str1.put(ch, str1.getOrDefault(ch, 0) + 1);
        }

        int need = str1.size();

        for (int i = 0; i < s2.length(); i++) {
            Map<Character, Integer> str2 = new HashMap<>();
            int num = 0;

            for (int j = i; j < s2.length(); j++) {
                char ch = s2.charAt(j);

                str2.put(ch, str2.getOrDefault(ch, 0) + 1);

                if (str1.getOrDefault(ch, 0) < str2.get(ch)) {
                    break;
                }

                if (str1.getOrDefault(ch, 0) == str2.get(ch)) {
                    num++;
                }

                if(num == need){
                    return true;
                }
            }
        }

        return false;
    }
}
