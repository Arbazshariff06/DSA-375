class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map01 = new HashMap<>();
        for (String str01 : banned) {
            if (map01.containsKey(str01)) {
                map01.put(str01, (map01.get(str01) + 1));
            } else {
                map01.put(str01, 1);
            }
        }

        String[] words = paragraph.toLowerCase().split("[^a-zA-z]+");
        HashMap<String, Integer> map02 = new HashMap<>();
        for (String str02 : words) {
            if (!map01.containsKey(str02)) {
                if (map02.containsKey(str02)) {
                    map02.put(str02, (map02.get(str02) + 1));
                } else {
                    map02.put(str02, 1);
                }
            }
        }
        String keyWithMaxValue = Collections.max(
                map02.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        return keyWithMaxValue;
    }
}