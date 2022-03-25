import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 패션왕신해빈_9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			HashMap<String, Integer> map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			while (n-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				String a = st.nextToken();
				if (map.containsKey(a))
					map.put(a, map.get(a) + 1);
				else
					map.put(a, 1);
			}
			int result = 1;
			for (int val : map.values())
				result *= (val + 1);
			sb.append(result - 1).append('\n');
		}
		System.out.println(sb);
	}
}