class Solution {
    public int minAddToMakeValid(String s) {
        int openingBracket = 0;
        int addOns = 0;

        for (char c: s.toCharArray()) {
            if (c == '(') {
                openingBracket ++;
            }
            else {
                if (openingBracket > 0) {
                    openingBracket --;
                }
                else if (openingBracket == 0) {
                    addOns ++;
                }
            }
        }

        return addOns + openingBracket;
    }
}