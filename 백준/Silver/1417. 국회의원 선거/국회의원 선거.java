import java.util.Scanner;

public class Main {
	
	public static int findMax(int[] array) {
		int max = array[0];
		int maxidx = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
				maxidx = i;
			}
		}
		return maxidx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int maxidx = findMax(arr);
		int min = 0;
		while (maxidx != 0){
			arr[maxidx]--;
			arr[0]++;
			min++;
			maxidx = findMax(arr);
		}
		System.out.println(min);
		
		sc.close();

	}

}
