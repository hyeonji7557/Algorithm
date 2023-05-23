package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공_1547 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[4];
		arr[1] = 1;
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (arr[x] == 1) {
				arr[y] = 1;
				arr[x] = 0;
			} else if (arr[y] == 1) {
				arr[y] = 0;
				arr[x] = 1;
			}
		}
		int num = 0;
		for (int i = 0; i < 4; i++) {
			if (arr[i] == 1) {
				num = i;
			}
		}
		System.out.println(num);
	}
}