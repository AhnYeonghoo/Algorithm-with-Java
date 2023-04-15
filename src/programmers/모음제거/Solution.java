package programmers.모음제거;

public class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char c : myString.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c =='i'
                    || c == 'o' || c == 'u')) answer += c;
        }
        return answer;
    }
}
