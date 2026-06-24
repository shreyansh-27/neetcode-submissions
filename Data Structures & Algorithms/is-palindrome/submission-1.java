class Solution {
    public boolean isPalindrome(String s) {

        if(s.length() == 1) return true;

        char[] str = s.replaceAll("\\s", "").toLowerCase().toCharArray();
        int start = 0;
        int end = str.length - 1;

        while(start < end){
            if(!Character.isLetterOrDigit(str[start])){start++;continue;}
            if(!Character.isLetterOrDigit(str[end])){end--;continue;}

            if(str[start] != str[end]) return false;
            start++;end--;
        }

        return true;
    }
}
