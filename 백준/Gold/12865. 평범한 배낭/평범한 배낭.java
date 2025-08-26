import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // dp 배열: 무게(w)일 때 얻을 수 있는 최대 가치
        int[] dp = new int[K + 1];

        // 각 물건에 대해 순회하며 dp 배열 갱신
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken()); // 무게
            int V = Integer.parseInt(st.nextToken()); // 가치

            // 무게 K부터 W까지 역순으로 순회
            for (int w = K; w >= W; w--) {
                // 현재 물건을 넣는 경우와 넣지 않는 경우 중 더 큰 가치 선택
                dp[w] = Math.max(dp[w], dp[w - W] + V);
            }//w-W는 현재 물건을 넣고 남은 무게 한도
            //dp[w-W]는 남은 무게 한도에 담을 수 있는 최대 가치
            //dp[w-W]+V는 현재 물건을 담고 남은 공간에 물건을 채웠을 때 얻을 수 있는 총 가치
        }

        System.out.println(dp[K]);
    }
}