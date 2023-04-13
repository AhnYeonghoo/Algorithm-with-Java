package programmers.순서쌍의_개수;

public class Solution {
    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) answer++;
        }

        return answer;
    }
}
