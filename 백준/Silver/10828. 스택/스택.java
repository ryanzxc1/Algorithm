import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String s = st.nextToken();
        	
        	
        	
        	if(s.equals("push")) {
        		
        		int	k = Integer.parseInt(st.nextToken());
        		stack.push(k);
        	}
        	else if(s.equals("top")) {
        		if(stack.isEmpty()) {
        			sb.append(-1).append('\n');
        		}
        		else {
        			sb.append(stack.peek()).append('\n');
        		}
        		}
        	else if(s.equals("pop")) {
        		if(stack.isEmpty()) {
        			sb.append(-1).append('\n');
        			
        		}
        		else {
        			sb.append(stack.pop()).append('\n');
        		}
        		
        	}
        	else if(s.equals("empty")) {
        		if(stack.isEmpty()) {
        			sb.append(1).append('\n');
        		}
        		else
        			sb.append(0).append('\n');
        	}
        	else if(s.equals("size")) {
        		sb.append(stack.size()).append('\n');
        	}
        	
        }
        
        
        System.out.println(sb.toString());
    
    }
}
