
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int M,N,K;
	static int [][] land;
	static boolean[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        
        for(int i=0;i<T;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	M=Integer.parseInt(st.nextToken());
        	N=Integer.parseInt(st.nextToken());
        	K=Integer.parseInt(st.nextToken());
        	land = new int [N][M];
        	visited = new boolean[N][M];
        	for(int j=0;j<K;j++) {
        		st=new StringTokenizer(br.readLine());
        		int x,y;
        		x=Integer.parseInt(st.nextToken());
        		y=Integer.parseInt(st.nextToken());
        		land[y][x]= 1;
        	}
        	
        	int count=0;
        	for(int j=0;j<N;j++) {
        		for(int k=0;k<M;k++) {
        			if(land[j][k]==1 && !visited[j][k]) {//visited = true는 앞 덩어리의 일부이므로 넘어가게됨
        				dfs(j,k);
        				count++;
        			}
        		}
        	}
        	sb.append(count+"\n");
        }
        System.out.println(sb);

    }
    public static void dfs(int y,int x) {
    	visited[y][x]=true;
    	
    	for(int i=0;i<4;i++) {
    		int nx=x +dx[i];
    		int ny=y+dy[i];
    		if(nx>=0&&nx<M&&ny>=0&&ny<N) {
    			if(land[ny][nx]==1 && !visited[ny][nx]) {
    				dfs(ny,nx);
    			}
    		}
    	}
    }
}