import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1_평균값구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++)
				sum += Integer.parseInt(st.nextToken());
			System.out.format("#%d %.0f\n", i, sum/10.0);
		}
	}
}