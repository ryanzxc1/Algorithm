import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        char[] line = new char[50];
        for(int i=0;i<N;i++) {
        	Stack<Character> vps = new Stack<>();
        	String inputString = br.readLine();
        	boolean isVPS= true;
        	line=inputString.toCharArray();
        	for(int j=0;j<line.length;j++) {
        		if(line[j]=='(')
        			vps.push(line[j]);
        		else if(line[j]==')') {
        			if(vps.isEmpty()) {
        				isVPS=false;
        				break;
        			}
        			vps.pop();
        			
        		}
        	}
        	if (vps.isEmpty()&&isVPS)
        		sb.append("YES\n");
        	else
        		sb.append("NO\n");
        		
        }
        
        System.out.println(sb);
        
        br.close();
    }
    
    
   
}