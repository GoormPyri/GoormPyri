import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] soldiers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 전투력 배열 초기화
        for (int i = 0; i < n; i++) {
            soldiers[i] = Integer.parseInt(st.nextToken());
        }

        // 가장 긴 감소하는 부분 수열 찾기
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // 자기 자신만으로 길이 1의 부분 수열이 만들어짐
            for (int j = 0; j < i; j++) {
                if (soldiers[j] > soldiers[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // 가장 긴 감소하는 부분 수열 중 최대 길이 찾기
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }

        // 열외해야 하는 병사 수 계산
        int removalCount = n - maxLength;

        // 결과 출력
        System.out.println(removalCount);
    }
}
