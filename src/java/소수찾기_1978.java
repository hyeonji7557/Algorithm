package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		while (st.hasMoreTokens()) {
			boolean prime = true;
			int a = Integer.parseInt(st.nextToken());
			if (a == 1)
				continue;
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime)
				count++;
		}
		System.out.println(count);
	}
}