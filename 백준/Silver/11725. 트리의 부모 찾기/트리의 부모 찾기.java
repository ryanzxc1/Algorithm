
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] adj;
    static int[] parent; 
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        adj = new ArrayList[N + 1];
        parent = new int[N + 1]; 
        visited = new boolean[N + 1];
        
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }
        
        
        dfs(1);
        
        
        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
    
   
    static void dfs(int node) {
        visited[node] = true;
        for (int i = 0; i < adj[node].size(); i++) {
            int neighbor = adj[node].get(i);
            if (!visited[neighbor]) {
                parent[neighbor] = node; // 부모 정보 저장
                dfs(neighbor);
            }
        }
    }
    
   
    
    
}