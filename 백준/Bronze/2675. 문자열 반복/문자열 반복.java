import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        StringBuilder sb = new StringBuilder();//가변 String
       
        int T = Integer.parseInt(br.readLine());
        
        
        for (int i = 0; i < T; i++) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            //공백,탭,줄바꿈을 구분자로 사용하여 문자열을 나눔
            
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            
            
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j));
                }
            }
            
            sb.append('\n');
        }
        
        
        System.out.print(sb.toString());
        br.close();
    }
}