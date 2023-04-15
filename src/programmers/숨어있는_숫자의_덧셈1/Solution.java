package programmers.숨어있는_숫자의_덧셈1;

public class Solution {
    public int solution(String myString) {
        int answer = 0;

        for (char c : myString.toCharArray()) {
            if (!(Character.isAlphabetic(c))) answer +=  Character.getNumericValue(c);
        }
        return answer;
    }
}
