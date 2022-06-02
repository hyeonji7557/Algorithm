import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 숫자카드2_10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}

	private static int lowerBound(int[] arr, int key) {
		int a = 0;
		int b = arr.length;
		while (a < b) {
			int mid = (a + b) / 2;
			if (key <= arr[mid])
				b = mid;
			else
				a = mid + 1;
		}
		return a;
	}

	private static int upperBound(int[] arr, int key) {
		int a = 0;
		int b = arr.length;
		while (a < b) {
			int mid = (a + b) / 2;
			if (key < arr[mid])
				b = mid;
			else
				a = mid + 1;
		}
		return a;
	}
}