import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken()); // 걸그룹 수
        int N = Integer.parseInt(st.nextToken()); // 문제 수

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < M; i++) {
            String str = br.readLine(); // 입력하는 걸그룹 이름
            int numberOfMembers = Integer.parseInt(br.readLine()); // 걸그룹 멤버 수

            ArrayList<String> girlGroupMembers = new ArrayList<>();
            for (int j = 0; j < numberOfMembers; j++) {
                String memberName = br.readLine();
                girlGroupMembers.add(memberName);
            }
            map.put(str, girlGroupMembers);
        }


        // 문제 갯수를 입력받는 부분
        for (int i = 0; i < N; i++) {
            String given = br.readLine(); // 멤버 혹은 팀 이름
            int memberOrTeam = Integer.parseInt(br.readLine()); // 0 이면 팀 멤버 이름 다, 1이면 어느 팀인지

            if (memberOrTeam == 0) {
                ArrayList<String> strings = map.get(given);
                Collections.sort(strings);
                for (String string : strings) {
                    bw.append(string).append("\n");
                }
            } else {
                for (String s : map.keySet()) {
                    ArrayList<String> strings = map.get(s);
                    if (strings.contains(given)) {
                        bw.append(s).append("\n");
                        break;
                    }
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
