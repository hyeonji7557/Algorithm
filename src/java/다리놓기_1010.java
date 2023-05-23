package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다리놓기_1010 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] arr = new int[30][30];
		for (int i = 0; i < 30; i++) {
			arr[i][i] = 1;
			arr[i][0] = 1;
		}
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++)
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
		}
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			sb.append(arr[n][m]).append('\n');
		}
		System.out.println(sb);
	}
}