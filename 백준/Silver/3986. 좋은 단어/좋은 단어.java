import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static boolean isGoodWord(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 단어의 수

        int goodWordCnt = 0; // 좋은 단어의 개수

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            // 좋은 단어의 경우 개수 증가
            if (isGoodWord(word)) {
                goodWordCnt++;
            }
        }

        System.out.println(goodWordCnt);
    }
}
