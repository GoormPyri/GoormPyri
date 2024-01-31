import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row1 = Integer.parseInt(st.nextToken());
        int col1 = Integer.parseInt(st.nextToken());

        int[][] binArr1 = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col1; j++) {
                binArr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int row2 = Integer.parseInt(st.nextToken());
        int col2 = Integer.parseInt(st.nextToken());

        int[][] binArr2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col2; j++) {
                binArr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j  = 0; j < col2; j++) {
                int sum = 0;
                for (int k = 0; k < col1; k++) {
                    sum += binArr1[i][k] * binArr2[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println("");
        }
    }
}
