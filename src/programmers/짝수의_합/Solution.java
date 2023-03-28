package programmers.짝수의_합;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;

    }
}
