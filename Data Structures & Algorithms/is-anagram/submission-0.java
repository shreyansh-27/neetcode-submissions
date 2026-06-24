class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        if(arr1.length != arr2.length) return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        for(i = 0; i < arr1.length; i++, j++){
            if(arr1[i] != arr2[j]){
                return false;
            }
        }

        return true;
    }
}
