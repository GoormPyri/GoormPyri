import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int cnt = 1; // 맨 오른쪽 막대기는 보이기 때문에 cnt는 1로 초기화

        for (int i = 0; i < N; i++) {
            stack.add(Integer.parseInt(br.readLine()));
        }

        int stick = 0;
        while (!stack.isEmpty()) {

            if (stick == 0) {
                stick = stack.pop();
            } else {
                int K = stack.pop();
                if (stick < K) {
                    cnt++;
                    stick = K;
                }
            }
        }
        System.out.println(cnt);
    }
}