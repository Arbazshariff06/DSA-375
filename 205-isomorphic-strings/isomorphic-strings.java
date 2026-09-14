class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch01 = s.charAt(i);
            char ch02 = t.charAt(i);
            if(map.containsKey(ch01)){
                if(map.get(ch01) != ch02)
                return false;
            }
            else{
                if(map.containsValue(ch02)){
                    return false;
                }
                map.put(ch01,ch02);
            }
        }
        return true;
    }
}