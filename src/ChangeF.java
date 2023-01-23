import java.util.Scanner;

public class ChangeF {
    public static void main(String[] args) {
        ChangeF f = new ChangeF();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.print(f.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer += Character.toLowerCase(x);
            } else if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            }
        }
        return answer;
    }
}
