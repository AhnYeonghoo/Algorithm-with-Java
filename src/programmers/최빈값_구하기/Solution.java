package programmers.최빈값_구하기;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int arr_max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > arr_max) {
                arr_max = array[i];
            }
        }

        int[] count = new int[arr_max + 1];
        int max = 0;

        int n = 0;
        int mode = 0;

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            mode++;

            if (count[i] == max) {
                n++;
            }
        }

        if (n > 1)
            answer = -1;

        return answer;
    }
}