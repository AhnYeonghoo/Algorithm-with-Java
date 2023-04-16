package programmers.자릿수_더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n);
        for (char c : temp.toCharArray()) {
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}
