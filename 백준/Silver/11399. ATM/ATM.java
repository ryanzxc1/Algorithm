import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> list = new LinkedList<>();
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		int total=0;
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=list.get(i);
			total +=sum;
		}
		System.out.println(total);
	}
}
