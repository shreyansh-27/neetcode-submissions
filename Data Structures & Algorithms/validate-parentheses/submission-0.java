class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> ad = new ArrayDeque<>();
        for(char ch: arr){
            if(ch == '(' || ch == '[' || ch == '{'){
                ad.addFirst(ch);
            }
            else{
                if(ad.isEmpty() || getPara(ad.peekFirst()) != ch){
                    return false;
                }
                ad.removeFirst();
            }
        }

        return ad.isEmpty();

    }

    private char getPara(char ch){
        return switch (ch) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> ch;
        };
    }
}
