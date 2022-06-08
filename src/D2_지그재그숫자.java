import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_지그재그숫자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			int a = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int j = 1; j <= a; j++) {
				if (j % 2 == 0)
					sum -= j;
				else
					sum += j;
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}