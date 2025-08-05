import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        LinkedList<Integer> list = new LinkedList<>();
        for(int j=1;j<=N;j++)
        	list.add(j);
        int i=0;
        
        while(!list.isEmpty()) {
        	i=(i+K-1)%list.size();
        	sb.append(list.remove(i));
        	
        	if(!list.isEmpty()) {
        		sb.append(", ");
        	}
        }
        sb.append(">");
        System.out.println(sb.toString());
        br.close();
    }
}

