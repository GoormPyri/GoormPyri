import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] array = new int[M];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
           
        Arrays.sort(array);

        for (int i = 0; i < M; i++) {
            if (N >= array[i]) {
                N++;
            }
        }
        bw.write(N + "");
        bw.flush();
        bw.close();
        br.close();
    }
}