import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        
        List<List<Integer>> costs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> houseCost = new ArrayList<>();
            houseCost.add(Integer.parseInt(st.nextToken())); 
            houseCost.add(Integer.parseInt(st.nextToken())); 
            houseCost.add(Integer.parseInt(st.nextToken())); 
            costs.add(houseCost);
        }
        
        
        for (int i = 1; i < N; i++) {
            
            int prevR = costs.get(i - 1).get(0);
            int prevG = costs.get(i - 1).get(1);
            int prevB = costs.get(i - 1).get(2);
            
            
            int currentR = costs.get(i).get(0) + Math.min(prevG, prevB);
            int currentG = costs.get(i).get(1) + Math.min(prevR, prevB);
            int currentB = costs.get(i).get(2) + Math.min(prevR, prevG);
            
           
            costs.get(i).set(0, currentR);
            costs.get(i).set(1, currentG);
            costs.get(i).set(2, currentB);
        }

       
        int resultR = costs.get(N-1).get(0);
        int resultG = costs.get(N-1).get(1);
        int resultB = costs.get(N-1).get(2);
            
        System.out.println(Math.min(resultR, Math.min(resultG, resultB)));
        
        br.close();
    }
}