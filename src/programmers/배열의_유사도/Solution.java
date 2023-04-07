package programmers.배열의_유사도;

import java.util.Arrays;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (Arrays.equals(s1[i].toCharArray(), s2[j].toCharArray())) answer++;
            }
        }
        return answer;
    }
}
