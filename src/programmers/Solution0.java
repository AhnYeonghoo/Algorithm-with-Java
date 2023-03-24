package programmers;

public class Solution0 {
    public int solution(String t, String p) {

        int cnt = t.length() - p.length() + 1;
        String[] targetArr = new String[cnt];
        int passCnt = 0;

        for (int i = 0; i < cnt; i++) {
            targetArr[i] = t.substring(i, p.length() + i);
            if (Long.parseLong(targetArr[i]) <= Long.parseLong(p)) {
                passCnt++;
            }
        }
        return passCnt;
    }
}
