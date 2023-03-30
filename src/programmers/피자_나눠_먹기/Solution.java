package programmers.피자_나눠_먹기;

public class Solution {
    public int solution(int slice, int n) {
        int answer =0;
        answer = n%7 != 0 ? (n/7) + 1 : n/7;

        return answer;
    }
}
