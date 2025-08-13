
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int K;
	static int count=0;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N= Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	if(N>=K) {
    		System.out.println(N-K);
    		return;
    	}
    	int[] dist= new int[100001];
    	Queue<Integer> queue = new LinkedList<>();
    	
    	dist[N]=0;//최소 시간 저장
    	queue.add(N);
    	
    	while(!queue.isEmpty()) {
    		int current = queue.poll();
    		if(current == K) {
    			System.out.println(dist[current]);
    		}
    		//-1
    		if(current-1>=0&&dist[current-1]==0) {//dist[]는 0이아니면 방문했다는 의미
    			dist[current-1]=dist[current]+1;
    			queue.add(current-1);
    		}
    		
    		//+1
    		if(current+1<=100000&&dist[current+1]==0) {
    			dist[current+1]=dist[current]+1;
    			queue.add(current+1);
    		}
    		//*2
    		if(current*2<=100000&&dist[current*2]==0) {
    			dist[current*2]=dist[current]+1;
    			queue.add(current*2);
    		}
    	}
    }  
    
    
}