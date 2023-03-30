package programmers.배열_자르기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = new int[num2];
//        int index = 0;
//        for (int i = num1; i <= num2; i++) {
//            answer[index] = numbers[i];
//            index++;
//        }
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;

    }

    public static void main(String[] args) {

    }
}
