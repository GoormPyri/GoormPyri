import java.util.Scanner;

public class Main {

	static int facFive(int n) { // 5의 개수가 기준 
	    int count = 0;
	    int i = 5; //5로 나누어 떨어지는 숫자 찾기 
	    while (n / i != 0) { // n이 i로 나누어떨이질때 실행 
	        count += n / i; // 5의 개수 업데이트 
	        i *= 5; // 5의 모든 거듭제곱에 대해 검사 
	    }
	    return count;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(facFive(N));
        sc.close();
    }
}
