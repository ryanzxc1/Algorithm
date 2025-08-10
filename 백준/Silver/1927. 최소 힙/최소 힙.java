import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	
	
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
        
        for(int i=0;i<N;i++) {
        	int tmp=Integer.parseInt(br.readLine());
        	
        	if(tmp==0) {
        		if(!priorityQueue.isEmpty())
        			sb.append(priorityQueue.poll()+"\n");
        		else {
        			sb.append(0+"\n");
        		}
        	}
        	else {
        		priorityQueue.add(tmp);
        	}
        }
        
        System.out.println(sb);
    }
    
}