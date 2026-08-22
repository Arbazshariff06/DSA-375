class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch01 : t.toCharArray()){
            if(map.containsKey(ch01)){
                map.put(ch01,map.get(ch01)+1);
            }else{
                map.put(ch01,1);
            }
        }
        for(char ch02 : s.toCharArray()){
            if(map.containsKey(ch02)){
                map.put(ch02,map.get(ch02)-1);
                if(map.get(ch02)==0){
                    map.remove(ch02);
                }
            }
        }
        return (char)map.keySet().toArray()[0];
    }
}