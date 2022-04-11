import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조합0의개수_2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		long a = five(n) - five(n - m) - five(m);
		long b = two(n) - two(n - m) - two(m);
		System.out.println(Math.min(a, b));
	}

	public static long five(long num) {
		int count = 0;
		while (num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		return count;
	}

	public static long two(long num) {
		int count = 0;
		while (num >= 2) {
			count += (num / 2);
			num /= 2;
		}
		return count;
	}
}