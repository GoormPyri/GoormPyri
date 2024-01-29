import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());	
		
		for (int i = 0; i < N; i++) {
			String order = br.readLine();
			
			if (order.startsWith("push")) {
				StringTokenizer st = new StringTokenizer(order, " ");
				st.nextToken();	
				stack.push(Integer.parseInt(st.nextToken())); 
			}
			else if(order.equals("pop")) {
				if(!stack.isEmpty()) {
					int pop = stack.pop();
					System.out.println(pop);
				} else {
					System.out.println("-1");
				}
			}
			else if(order.equals("size")) {
				System.out.println(stack.size());
			}
			else if(order.equals("empty")) {
				if(!stack.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println("1");
				}
			}
			else if(order.equals("top")) {
				if(!stack.isEmpty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println("-1");
				}
				
			}
			
		}

	}

}
