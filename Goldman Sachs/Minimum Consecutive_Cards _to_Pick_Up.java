import java.util.*;

class Solution {
    public int minimumCardPickup(int[] cards) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                map.get(cards[i]).add(i);
            } else {
                map.put(cards[i], new ArrayList<>());
                map.get(cards[i]).add(i);
            }
        }
        for (Map.Entry<Integer, List<Integer>> x : map.entrySet()) {
            if (x.getValue().size() > 1) {
                List<Integer> list = x.getValue();
                for (int i = 1; i < list.size(); i++) {
                    min = Math.min(list.get(i) - list.get(i - 1) + 1, min);
                }
            }
        }
        if (min == Integer.MAX_VALUE)
            return -1;
        else
            return min;
    }
}