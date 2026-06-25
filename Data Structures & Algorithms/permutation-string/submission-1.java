class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        String str1 = new String(arr);

        for(int i = 0; i < s2.length(); i++){
            for(int j = i; j < s2.length(); j++){

                char[] arr2 = s2.substring(i, j+1).toCharArray();

                Arrays.sort(arr2);
                String str2 = new String(arr2);
                if(str1.equals(str2)){
                    return true;
                }

            }
        }

        return false;
    }
}
