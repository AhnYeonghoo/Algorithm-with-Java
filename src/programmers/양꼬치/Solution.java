package programmers.양꼬치;



public class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        for (int i = 0; i < n; i++ ) {
            answer += 12000;
        }
        int flag = n / 10;

        answer += (k * 2000) - (flag * 2000);

        return answer;
    }
}
