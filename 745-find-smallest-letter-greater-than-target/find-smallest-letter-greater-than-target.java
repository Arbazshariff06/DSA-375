class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int result = Integer.MAX_VALUE;;
     for(int i=0;i<letters.length;i++){
        char ch = letters[i];
        if(ch > target && ch < result){
            result = ch;
        }
     }
     if(result == Integer.MAX_VALUE){
        return letters[0];
     }   
     return (char)(result);
    }
}