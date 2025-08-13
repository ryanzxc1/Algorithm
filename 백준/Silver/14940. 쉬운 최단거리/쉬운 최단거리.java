import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
    static int[][] land;
    static int[][] dist;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	n= Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	
    	land = new int[n][m];
    	dist=new int[n][m];
    	Queue<int[]> queue = new LinkedList<>();
    	for(int i=0;i<n;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0;j<m;j++) {
    			land[i][j]=Integer.parseInt(st.nextToken());
    			if(land[i][j]==2) {
    				queue.add(new int[]{i,j});
    				dist[i][j]=0;
    				
    			}
    			else {
    				dist[i][j]=-1;
    			}
    		}
    	}
    	while(!queue.isEmpty()) {
    		int[] current = queue.poll();
    		int x=current[0];
    		int y=current[1];
    		
    		
    		for(int i=0;i<4;i++) {
    			int nx=x+dx[i];
    			int ny = y+dy[i];
    			if(nx>=0&&nx<n&&ny>=0&&ny<m) {
    				if(dist[nx][ny]==-1 && land[nx][ny]==1) {
    					dist[nx][ny]=dist[x][y]+1;
    					queue.add(new int[] {nx,ny});
    				}
    			}
    		}
    	}
    	
    	for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    	
    }  
    
    
}