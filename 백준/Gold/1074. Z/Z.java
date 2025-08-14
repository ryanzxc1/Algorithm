import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int result = 0;
    static int r, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        solve((int) Math.pow(2, N), 0, 0);

        System.out.println(result);
    }
    
    
    public static void solve(int size, int x, int y) {
        if (size == 1) {
            return;
        }

        int newSize = size / 2;
        int area = newSize * newSize;

        //1사분면
        if (r < x + newSize && c < y + newSize) {
            solve(newSize, x, y);
        }
        //2사분면
        else if (r < x + newSize && c >= y + newSize) {
            result += area;
            solve(newSize, x, y + newSize);
        }
        //3사분면
        else if (r >= x + newSize && c < y + newSize) {
            result += area * 2;
            solve(newSize, x + newSize, y);
        }
        //4사분면
        else if (r >= x + newSize && c >= y + newSize) {
            result += area * 3;
            solve(newSize, x + newSize, y + newSize);
        }
    }
}