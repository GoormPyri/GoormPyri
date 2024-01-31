import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if (N == 0) {
			System.out.println(1);
			return;
		}
		
		int oriN = N;
		int newN = 0;
		int cnt = 0;
		while(oriN != newN) {
			if (N < 10) {
				N = N*10 + N;
			} else {
				N = (N%10)*10 + ((N%10) + (N/10))%10;
			}
			newN = N;
			cnt++;
		}
		System.out.println(cnt);
		
	}

}
