package programmers.암호_해독;

public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code -1; i <= cipher.length()-1; i += code) {
            answer += cipher.charAt(i);
        }

        return answer;
    }
}
