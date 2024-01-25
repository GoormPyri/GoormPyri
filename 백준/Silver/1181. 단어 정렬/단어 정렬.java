import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String [] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String w1, String w2) {
				if(w1.length() == w2.length()) { // 단어의 길이가 같으면 
					return w1.compareTo(w2); // 사전 순으로 정렬 
				}
				else { // 아니라면 
					return w1.length() - w2.length(); // 단어 길이 순으로 
				}
			}
		}
		);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(arr[0]).append("\n");
		for (int i = 1; i < N ; i++) {
			// 중복 제거
			if(!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.println(sb);

	}

}
