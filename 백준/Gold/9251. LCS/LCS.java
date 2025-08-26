

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        /*
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        */
        
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // 문자가 같을 경우 대각선 위 값에 1을 더함
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 문자가 다를 경우 위쪽과 왼쪽 값 중 더 큰 값을 가져옴
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[len1][len2]);
    }
}
//dp[i-1][j-1]은 s1의 i-1번째 문자까지, 그리고 s2의 j-1번째 문자까지 비교했을 때의 최장 공통 부분 수열의 길이를 의미