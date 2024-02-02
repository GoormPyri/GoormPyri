import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int [15][15];
		for (int i = 0; i < 15; i++) {
			arr[i][1] = 1; // 1호 설정
			arr[0][i] = i; // 1층 설정 
		}
		
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int k = sc.nextInt(); // 층 
			int n = sc.nextInt(); // 호 
			System.out.println(arr[k][n]);
		}
		
		sc.close();
		
		

	}

}
