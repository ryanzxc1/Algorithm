import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int count = 0;
    static int[] board; //각 행에 놓인 퀸의 열(column) 위치를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N];
        
        solveNQueens(0);
        
        System.out.println(count);
        br.close();
    }

   
    public static void solveNQueens(int row) {
        
        if (row == N) {
            count++;
            return;
        }

        
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row] = col; 
                solveNQueens(row + 1); 
            }
        }
    }


    public static boolean isSafe(int row, int col) {
        
        for (int prevRow = 0; prevRow < row; prevRow++) {
            
            if (board[prevRow] == col) {
                return false;
            }

            
            if (Math.abs(row - prevRow) == Math.abs(col - board[prevRow])) {
                return false;
            }
        }
        return true;
    }
}