import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static List<List<Integer>> graph; 
	//이중 연결 리스트
	static boolean[] visited;
	static int count=0;
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
       	graph= new ArrayList<>();
       	for(int i=0;i<=N;i++) {
       		graph.add(new ArrayList<>());
       	}
       	
       	for(int i=0;i<M;i++) {
       		StringTokenizer st = new StringTokenizer(br.readLine());
       		int u = Integer.parseInt(st.nextToken());
       		int v = Integer.parseInt(st.nextToken());
       		
       		graph.get(u).add(v);
       		graph.get(v).add(u);
       	}
       	visited = new boolean[N+1];
       	
       	dfs(1);
        
        System.out.println(count -1);
        br.close();
    }
    
    public static void dfs(int node) {
    	visited[node] = true;
    	count ++;
    	
    	List<Integer> neighbors = graph.get(node);
    	for(int i=0 ; i<neighbors.size();i++) {
    		int neighbor = neighbors.get(i);
    		if(!visited[neighbor]) {
    			dfs(neighbor);
    		}
    	}
    }
}	
