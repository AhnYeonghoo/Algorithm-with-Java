package programmers.배열의_평균값;

public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int result = 0;
        for (int i : numbers) {
            result += i;
        }

        answer = (double) result / numbers.length;


        return answer;


    }

}
