import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_파리퇴치 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int a = 1; a <= t; a++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			int max = 0;
			for (int i = 0; i <= n - m; i++) {
				for (int j = 0; j <= n - m; j++) {
					int sum = 0;
					for (int k = i; k < i + m; k++) {
						for (int l = j; l < j + m; l++)
							sum += arr[k][l];
					}
					if (sum >= max)
						max = sum;
				}
			}
			System.out.println("#" + a + " " + max);
		}
	}
}