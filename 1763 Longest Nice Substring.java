class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isNice(sub) && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }
        return ans;
    }
    private boolean isNice(String s) {
    boolean[] lower = new boolean[26];
    boolean[] upper = new boolean[26];

    for (char c : s.toCharArray()) {
        if (Character.isLowerCase(c)) {
            lower[c - 'a'] = true;
        } else {
            upper[c - 'A'] = true;
        }
    }

    for (int i = 0; i < 26; i++) {
        if (lower[i] != upper[i]) {
            return false;
        }
    }

    return true;
}
}
