package programmers.특정문자_제거하기;

public class Solution {
    public String solution(String myString, String letter) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != letter.charAt(0)) {
                answer += myString.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("BCBdbe", "B"));
    }
}
