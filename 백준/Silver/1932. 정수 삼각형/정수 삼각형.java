
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			List<Integer> li = new ArrayList<>();
			for(int j=0;j<i;j++) {
				li.add(Integer.parseInt(st.nextToken()));
			}
			list.add(li);
		}
		
		for(int i=1;i<N;i++) {
			int prevLeft=0, prevRight=0; 
			
			for(int j=0;j<=i;j++) {
				int tmp=0;
				if(j==0) {
					tmp=list.get(i-1).get(0)+list.get(i).get(j);
					list.get(i).set(0, tmp);
					continue;
				}
				if(j==i) {
					tmp=list.get(i-1).get(j-1)+list.get(i).get(j);
					list.get(i).set(j, tmp);
					continue;
				}
				
				prevLeft=list.get(i-1).get(j-1);
				prevRight=list.get(i-1).get(j);
				tmp = Math.max(prevLeft, prevRight) + list.get(i).get(j);
				list.get(i).set(j, tmp);
				
			}
		}
		/*
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println();
		}
		*/
		
		int max=0;
		for(int i=0;i<N;i++) {
			if(list.get(N-1).get(i)>max) max=list.get(N-1).get(i);
		}
		
		
		System.out.println(max);
		
	}
}