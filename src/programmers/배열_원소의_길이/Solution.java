package programmers.배열_원소의_길이;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].toString().length();
        }
        return answer;
    }
}
