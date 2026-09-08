class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] c01 = word1.toCharArray();
        char[] c02 = word2.toCharArray();
        char[] c03 = new char[c01.length+c02.length];
        int i=0;
        int j=0;
        int k=0;
        while(k<c03.length){
            if(i<c01.length){
                c03[k] = c01[i];
                i++;
                k++;
            }
            if(j<c02.length){
                c03[k] = c02[j];
                j++;
                k++;
            }
        }
        String str = new String(c03);
        return str;
    }
}