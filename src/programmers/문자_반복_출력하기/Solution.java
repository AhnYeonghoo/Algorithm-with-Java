package programmers.문자_반복_출력하기;

public class Solution {
    public String solution(String myString, int n) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", 3));
    }
}
