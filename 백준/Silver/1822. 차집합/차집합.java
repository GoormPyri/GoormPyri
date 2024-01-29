import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        TreeSet<Integer> Mset = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Mset.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int Nset = Integer.parseInt(st.nextToken());
            Mset.remove(Nset);
        }

        sb.append(Mset.size() + "\n");
        for (Integer num : Mset) {
            sb.append(num + " ");
        }
        System.out.println(sb);
    }
}