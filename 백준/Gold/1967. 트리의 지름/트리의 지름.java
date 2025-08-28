



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Main {
	static class Node  {
	    int to, weight;

	    public Node(int to, int weight) {
	        this.to = to;
	        this.weight = weight;
	    }

	   
	}

    static List<Node>[] graph;
    static boolean[] visited;
    static int maxDistance=0;
    static int farthestNode=0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        N= Integer.parseInt(br.readLine());
        
        graph = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u,w));
        }

        visited = new boolean[N+1];
        dfs(1,0);
        visited = new boolean[N+1];
        dfs(farthestNode,0);
        System.out.println(maxDistance);
       
        

        br.close();
    }

    private static void dfs(int start, int distance) {
    	visited[start]=true;
    	
    	if(distance>maxDistance) {
    		maxDistance=distance;
    		farthestNode=start;
    		
    	}
    	
    	for(int i=0;i<graph[start].size();i++) {
    		Node nextNode= graph[start].get(i);
    		if(!visited[nextNode.to]) {
    			dfs(nextNode.to, distance + nextNode.weight);
    		}
    	}
    }
    
    
}