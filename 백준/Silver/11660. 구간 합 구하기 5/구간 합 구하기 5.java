import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        List<List<Integer>> arr = new ArrayList<>();
        int[][] prefixSum = new int[N+1][N+1];
        for(int i=0;i<N;i++) {
        	List<Integer> list = new ArrayList<>();
        	st = new StringTokenizer(br.readLine());
        	for(int j=0;j<N;j++)
        		list.add(Integer.parseInt(st.nextToken()));
        	arr.add(list);
        }
        for(int i=1;i<=N;i++) {
        	for(int j=1;j<=N;j++) {
        		prefixSum[i][j] = arr.get(i-1).get(j-1) + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
        	}
        }
        
        for(int i=0;i<M;i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	int x1 = Integer.parseInt(st.nextToken());
        	int y1 = Integer.parseInt(st.nextToken());
        	int x2 = Integer.parseInt(st.nextToken());
        	int y2 = Integer.parseInt(st.nextToken());
        	
        	
        	int result = prefixSum[x2][y2] - prefixSum[x1 - 1][y2] - prefixSum[x2][y1 - 1] + prefixSum[x1 - 1][y1 - 1];
        	sb.append(result+"\n");
        }
        System.out.println(sb);
        br.close();
    }
}
