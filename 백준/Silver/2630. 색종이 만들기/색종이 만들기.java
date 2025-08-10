import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int numW = 0; 
    static int numB = 0; 
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        checkWB(0, 0, N);

        System.out.println(numW);
        System.out.println(numB);
    }

    
    public static void checkWB(int x, int y, int size) {
        
        if (isAllSameColor(x, y, size)) {
            if (map[x][y] == 0) {
                numW++; 
            } else {
                numB++; 
            }
            return; //만약 isAllSameColor가 나온다면(같은색) return으로 재귀 정지
        }

        
        int newSize = size / 2;
        
        checkWB(x, y, newSize); 
        checkWB(x, y + newSize, newSize); 
        checkWB(x + newSize, y, newSize); 
        checkWB(x + newSize, y + newSize, newSize);
    }

    
    public static boolean isAllSameColor(int x, int y, int size) {
        int firstColor = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] != firstColor) {
                    return false;
                }
            }
        }
        return true; 
    }

}
