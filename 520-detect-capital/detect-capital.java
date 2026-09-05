class Solution {
    public boolean detectCapitalUse(String word) {
        int index = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                index++;
            }
        }
        return index == 0 || index == word.length() || (index == 1 && Character.isUpperCase(word.charAt(0)));
    }
}