//자바 컬렉션 프레임워크로 구현하기 
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());	
		
		for (int i = 0; i < N; i++) {
			String order = br.readLine();
			
			if (order.startsWith("push")) {
				StringTokenizer st = new StringTokenizer(order, " ");
				st.nextToken();
				queue.add(Integer.parseInt(st.nextToken()));
				//queue.offer(Integer.parseInt(st.nextToken()));
			}
			else if(order.equals("pop")) {
				
				if(queue.peek()==null) { 
					System.out.println(-1);
				}
				else {
					System.out.println(queue.poll());
					//queue.remove();
				}
			}
			else if(order.equals("size")) {
				System.out.println(queue.size());
			}
			else if(order.equals("empty")) {
				if(!queue.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(1);
				}
				
			}
			else if(order.equals("front")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.peek());
				}
				else {
					System.out.println(-1);
				}
				
			}
			else if(order.equals("back")) {
			    if (!queue.isEmpty()) {
			        System.out.println(((LinkedList<Integer>) queue).getLast());
			    } else {
			        System.out.println(-1);
			    }
			}

		}
		

	}

}
