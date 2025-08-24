

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][n];
            int[][] dp = new int[2][n];

            // 스티커 점수 입력
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    stickers[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // n이 1일 경우 예외 처리
            if (n == 1) {
                System.out.println(Math.max(stickers[0][0], stickers[1][0]));
                continue;
            }

            // 초기값 설정
            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];
            dp[0][1] = stickers[1][0] + stickers[0][1];
            dp[1][1] = stickers[0][0] + stickers[1][1];

            // DP 점화식 적용
            for (int j = 2; j < n; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + stickers[1][j];
            }
            //j열의 위쪽 스티커를 떼기로 결정했다면, 바로 이전 열(j-1)에서는 반드시 아래쪽 스티커를 뗐거나, 또는 아무것도 떼지 않은 것
            //각 열에서 위에서 뗄 경우 최댓값, 아래에서 뗄 경우 최댓값 갱신하면서 가는 것
            System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
        }
    }
}