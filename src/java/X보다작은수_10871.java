package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (a < x)
				sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
