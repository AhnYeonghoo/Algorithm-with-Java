package programmers.최댓값_만들기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        int last = numbers[numbers.length - 1];
        int twoLast = numbers[numbers.length - 2];
        answer = last * twoLast;

        return answer;
    }
}
