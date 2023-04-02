package programmers.편지;

public class Solution {
    public int solution(String message) {
        int answer = 0;
        for (int i = 0; i < message.length(); i++) {
            answer+=2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("happy birthday!"));
    }
}
