package programmers.두수의_나눗셈;

public class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / (double)num2;
        answer *= 1000;

        return (int) answer;
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.solution(3, 2));
    }
}
