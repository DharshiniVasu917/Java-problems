class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, int parts,
                           List<String> current, List<String> result) {
        if (parts == 4 && index == s.length()) {
            result.add(String.join(".", current));
            return;
        }

        if (parts == 4 || index == s.length()) {
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);

            if ((part.length() > 1 && part.charAt(0) == '0')
                    || Integer.parseInt(part) > 255) {
                continue;
            }

            current.add(part);
            backtrack(s, index + len, parts + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
