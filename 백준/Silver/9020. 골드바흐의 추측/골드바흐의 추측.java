import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            findGoldbachPartition(K);
        }
    }

    // 숫자가 소수인지 확인하는 함수
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 주어진 짝수에 대한 골드바흐 파티션을 찾는 함수
    private static void findGoldbachPartition(int K) {
        int half = K / 2;
        for (int i = half; i >= 2; i--) {
            if (isPrime(i) && isPrime(K - i)) {
                System.out.println(i + " " + (K - i));
                return;
            }
        }
    }
}
