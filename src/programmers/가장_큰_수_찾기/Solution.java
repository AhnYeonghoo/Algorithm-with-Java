package programmers.가장_큰_수_찾기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] array) {

        int[] answer = new int[2];
        Arrays.sort(array);
        answer[0] = array[array.length-1];
        answer[1] = IntStream.range(0, array.length-1)
                .filter(i -> array[array.length-1] == answer[0])
                .findFirst()
                .orElse(-1);
        return answer;

    }
}
