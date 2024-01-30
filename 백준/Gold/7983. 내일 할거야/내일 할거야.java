import java.util.*;

class Task {
    int work, deadline;

    Task(int work, int deadline) {
    	this.work = work;
        this.deadline = deadline;
        
    }
}

public class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 과제의 수 
		List<Task> tasks = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int W = sc.nextInt();
			int D = sc.nextInt();
			tasks.add(new Task(W, D));
		}
		tasks.sort((task1, task2) -> Integer.compare(task2.deadline, task1.deadline)); // 람다 표현식 
		
		int start = Integer.MAX_VALUE;
		for (Task task : tasks) {
			if (start > task.deadline) {
				start = task.deadline;
			}
		   start -= task.work;
		}
		System.out.println(Math.max(start,0));
		sc.close();

	}

}