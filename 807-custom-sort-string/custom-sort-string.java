import java.util.HashMap;

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            if (m.containsKey(order.charAt(i))) {
                int count = m.get(order.charAt(i));
                for (int j = 0; j < count; j++) {
                    st.append(order.charAt(i));
                }
                m.remove(order.charAt(i));
            }
        }

        for (Character key : m.keySet()) {
            int count = m.get(key);
            for (int i = 0; i < count; i++) {
                st.append(key);
            }
        }

        return st.toString();
    }
}