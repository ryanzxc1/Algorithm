
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N= Integer.parseInt(br.readLine());
       
        StringBuilder sb = new StringBuilder();
        
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=0;i<N;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String s = st.nextToken();
        	int k=0;
        	if(s.equals("add")) {
        		k=Integer.parseInt(st.nextToken());
        		list.add(k);
        	}
        	else if(s.equals("remove")) {
        		k=Integer.parseInt(st.nextToken());
        		list.remove((Object) k);
        		
        	}
        	else if(s.equals("check")){
        		k=Integer.parseInt(st.nextToken());
        		if(list.contains(k)) {
        			sb.append(1).append("\n");
        		}
        		else {
        			sb.append(0).append("\n");
        		}
        	}
        	else if(s.equals("toggle")) {
        		k=Integer.parseInt(st.nextToken());
        		if(list.contains(k)) {
        			list.remove((Object)k);
        		}
        		else {
        			list.add(k);
        		}
        	}
        	else if(s.equals("all")) {
        		list.clear();
        		for(int j=1;j<=20;j++) {
        			list.add(j);
        		}
        	}
        	else if(s.equals("empty")) {
        		list.clear();
        	}
        }
        
        
        
        
        System.out.println(sb.toString());
        br.close();
    }
}