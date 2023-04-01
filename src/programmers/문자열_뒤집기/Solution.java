package programmers.문자열_뒤집기;

public class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = myString.length()-1; i >= 0; i--) {
            char c = myString.charAt(i);
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("jaron"));
    }
}
