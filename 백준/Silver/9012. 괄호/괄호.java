import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스
        
        for (int i = 0; i < T; i++) { // 테스트 케이스만큼 반복 
            String input = br.readLine(); 
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true; 

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j); // 현재 문자
                
                if (c == '(') { // "("일 때 push 
                    stack.push(c);
                } else if (c == ')') { // ")"일 때는 
                    if (stack.isEmpty()) { // 스택에 "("가 없으면 
                        isVPS = false; // VPS 가 아님
                        break; 
                    } else { // 스택에 "("가 있으면 
                        stack.pop(); // "("을 하나 pop 
                    }
                }
            }

            if (!stack.isEmpty()) { // 스택이 비어있지 않으면 VPS가 아님 
                isVPS = false;
            }
            
            System.out.println(isVPS ? "YES" : "NO"); 
        }
    }
}
