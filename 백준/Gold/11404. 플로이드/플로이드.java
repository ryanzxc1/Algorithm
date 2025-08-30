import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        
        final int INF = 100000 * n + 1;//큰 값으로 설정
        List<List<Integer>> graph = new ArrayList<>();

        //그래프 초기화
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    row.add(0); //자기 자신으로 가는 비용은 0
                } else {
                    row.add(INF); //연결되지 않은 도시는 무한대로 설정
                }
            }
            graph.add(row);
        }

        //입력 받기
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1; // 0-based index
            int end = Integer.parseInt(st.nextToken()) - 1;   // 0-based index
            int cost = Integer.parseInt(st.nextToken());
            
            //기존 비용보다 더 작은 비용이 들어오면 갱신
            if (graph.get(start).get(end) > cost) {
                graph.get(start).set(end, cost);
            }
        }

        // 플로이드-워셜 알고리즘
        // k: 경유지, i: 출발지, j: 도착지
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int viaCost = graph.get(i).get(k) + graph.get(k).get(j);
                    
                    if (graph.get(i).get(j) > viaCost) {
                        graph.get(i).set(j, viaCost);
                    }
                }
            }
        }

        //출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cost = graph.get(i).get(j);
                if (cost == INF) {
                    sb.append(0).append(" ");
                } else {
                    sb.append(cost).append(" ");
                }
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }
}