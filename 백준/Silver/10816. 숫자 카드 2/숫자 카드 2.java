import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int n = Integer.parseInt(br.readLine());
        
        
        HashMap<Integer, Integer> cardCounts = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
        }
        
        
        int m = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int numberToFind = Integer.parseInt(st.nextToken());
            sb.append(cardCounts.getOrDefault(numberToFind, 0)).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
