import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<N;i++) {
        	queue.add(i+1);
        }
        int num=0;
        while(queue.size()>1) {
        	int tmp=0;
        	
        	if(num==0) {
        		tmp=queue.poll();
        		num=1;
        	}
        	if(num==1) {
        		tmp=queue.poll();
        		queue.add(tmp);
        		num=0;
        	}
        		
        }
       
        
        //Queue 출력
        Iterator<Integer> iter = queue.iterator();
        while(iter.hasNext())
        	System.out.print(iter.next());
        
        br.close();
    }
    
    
   
}
