import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx= {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int land[][]= new int[N][M];
        Queue<int[]> queue = new LinkedList<>();
        
        
        
        for(int i=0;i<N;i++) {
        	st=new StringTokenizer(br.readLine());
        	for(int j=0;j<M;j++) {
        		land[i][j]=Integer.parseInt(st.nextToken());
        		if(land[i][j]==1) {
        			queue.add(new int[] {i,j,0});
        		}
        		
        	}
        }
        int maxDays=0;
    	
        while(!queue.isEmpty()) {
        	
        	int[] current = queue.poll();
        	int y= current[0];
        	int x= current[1];
        	int day = current[2];
        	maxDays=day;
        	
        	for(int i=0;i<4;i++) {
        		int nx =x+dx[i];
        		int ny =y+dy[i];
        		
        		if(ny>=0&&ny<N &&nx>=0&&nx<M&&(land[ny][nx]==0)) {
        			land[ny][nx]=1;
        			queue.add(new int[] {ny,nx,day+1});
        			
        		}
        	}
        	
        	
        }
       
        for(int i=0;i<N;i++) {
        	for(int j=0;j<M;j++) {
        		if(land[i][j]==0) {
        			System.out.println(-1);
        			return;
        		}
        	}
        }
        System.out.println(maxDays);
    }
}