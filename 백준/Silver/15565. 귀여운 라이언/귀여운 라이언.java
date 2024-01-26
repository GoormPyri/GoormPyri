import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// N, K 배열 입력받
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
     	StringTokenizer st = new StringTokenizer(x," ");
     	int N = Integer.parseInt(st.nextToken());
     	int K = Integer.parseInt(st.nextToken());
     	x = br.readLine();
     	st = new StringTokenizer(x," ");
     	int arr [] = new int[N];
     	// lion 배열 만들기 
     	ArrayList<Integer> lion = new ArrayList<>();
     	for (int i = 0; i < N ; i++) {
     		arr[i] = Integer.parseInt(st.nextToken());
     		if (arr[i]==1) {
     			lion.add(i);
     		}
     	}
     	// 투 포인터 
     	int start = 0, end = 0;
     	int count = 0; // '1'의 개수를 세는 변수
     	int min = Integer.MAX_VALUE;

     	while (end < lion.size()) {
     	    count++;

     	    if (count >= K) {
     	        min = Math.min(min, lion.get(end) - lion.get(start) + 1);
     	        count--;
     	        start++;
     	    }

     	    end++;
     	}

     	if (min != Integer.MAX_VALUE) {
     	    System.out.println(min);
     	} else {
     	    System.out.println(-1);
     	}
     	
	}

}