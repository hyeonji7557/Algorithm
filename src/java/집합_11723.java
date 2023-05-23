package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 집합_11723 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int a = 0;
			switch (str) {
			case "add":
				a = Integer.parseInt(st.nextToken());
				set.add(a);
				break;
			case "remove":
				a = Integer.parseInt(st.nextToken());
				set.remove(a);
				break;
			case "check":
				a = Integer.parseInt(st.nextToken());
				if (set.contains(a))
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "toggle":
				a = Integer.parseInt(st.nextToken());
				if (set.contains(a))
					set.remove(a);
				else
					set.add(a);
				break;
			case "all":
				for (int j = 0; j < 20; j++) {
					set.add(j + 1);
				}
				break;
			case "empty":
				set.clear();
				break;
			}
		}
		System.out.print(sb.toString());
	}
}