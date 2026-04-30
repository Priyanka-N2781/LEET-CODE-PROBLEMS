import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[26];
        boolean[] visit = new boolean[26];

        for(char c : s.toCharArray()) freq[c-'a']++;

        StringBuilder st = new StringBuilder();

        for(char c : s.toCharArray()) {
            freq[c-'a']--;

            if(visit[c-'a']) continue;

            while(st.length()>0 &&
                  st.charAt(st.length()-1) > c &&
                  freq[st.charAt(st.length()-1)-'a'] > 0) {

                visit[st.charAt(st.length()-1)-'a'] = false;
                st.deleteCharAt(st.length()-1);
            }

            st.append(c);
            visit[c-'a'] = true;
        }

        System.out.println(st.toString());
    }
}
