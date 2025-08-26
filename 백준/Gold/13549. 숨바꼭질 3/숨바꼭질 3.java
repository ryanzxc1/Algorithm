
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int[] dist;
    static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        // dist 배열을 -1로 초기화 (방문하지 않은 상태를 의미)
        dist = new int[MAX + 1];
        for (int i = 0; i <= MAX; i++) {
            dist[i] = -1;
        }

        // Deque를 사용하여 0-1 BFS 구현(양방향 입출력)
        Deque<Integer> dq = new LinkedList<>();
        
        dist[N] = 0; // 시작점 시간은 0
        dq.add(N);
        
        while (!dq.isEmpty()) {
            int current = dq.pollFirst();
            
            if (current == K) {//current==k가 되기 전까지 모든 경우의 수 탐색
                System.out.println(dist[current]);
                return;
            }

            // 순간이동 (*2) : 0초 소요 -> Deque의 앞에 추가
            int nextTeleport = current * 2;
            if (nextTeleport <= MAX && dist[nextTeleport] == -1) {
                dist[nextTeleport] = dist[current];
                dq.addFirst(nextTeleport);
            }
            
            // 걷기 (-1) : 1초 소요 -> Deque의 뒤에 추가
            int nextWalkLeft = current - 1;
            if (nextWalkLeft >= 0 && dist[nextWalkLeft] == -1) {
                dist[nextWalkLeft] = dist[current] + 1;
                dq.addLast(nextWalkLeft);
            }

            // 걷기 (+1) : 1초 소요 -> Deque의 뒤에 추가
            int nextWalkRight = current + 1;
            if (nextWalkRight <= MAX && dist[nextWalkRight] == -1) {
                dist[nextWalkRight] = dist[current] + 1;
                dq.addLast(nextWalkRight);
            }
        }
    }
}