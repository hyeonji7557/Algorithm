import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수_1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		if (n < 100)
			cnt = n;
		else {
			cnt = 99;
			if (n == 1000)
				n = 999;
		}
		for (int i = 100; i <= n; i++) {
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;
			if ((a - b) == (b - c))
				cnt++;
		}
		System.out.println(cnt);
	}
}