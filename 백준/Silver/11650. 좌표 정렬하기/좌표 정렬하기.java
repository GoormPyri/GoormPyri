import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] arr = new int [N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			// 첫 번째 원소가 같다면 두 번째 원소끼리 비교 
			public int compare(int[] e1, int[] e2) {
				if (e1[0] == e2[0]) {
					return e1[1] - e2[1];
				}
				else {
					return e1[0] - e2[0];
				}
			}
			
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		sc.close();

	}

}
