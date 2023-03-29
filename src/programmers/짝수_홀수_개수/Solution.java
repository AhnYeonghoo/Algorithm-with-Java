package programmers.짝수_홀수_개수;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int wcount = 0;
        int gcount = 0;
        for (int i : num_list) {
            if (i % 2 == 0) {
                wcount++;
            } else {
                gcount++;
            }
        }

        answer = new int[2];


        answer[0] = wcount;
        answer[1] = gcount;



        return answer;

    }


}
