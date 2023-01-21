import java.util.*;

public class FindChar {
    public static void main(String[] args) {
        FindChar F = new FindChar();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char ch = scan.next().charAt(0);

        System.out.print(F.solution(str, ch));
    }

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase(); // 대문자로 변경
        t = Character.toUpperCase(t); // 대문자로 변경

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }

        return answer;
    }
}
