package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_시각덧셈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int result1 = a + c;
			int result2 = b + d;
			if (result2 >= 60) {
				result1 += result2 / 60;
				result2 = result2 % 60;
			}
			if (result1 > 12) {
				if (result1 % 12 == 0)
					result1 = 12;
				else
					result1 = result1 % 12;
			}
			System.out.printf("#%d %d %d\n", i, result1, result2);
		}
	}
}