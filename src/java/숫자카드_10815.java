package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class 숫자카드_10815 {
	static int[] arr;
	static int[] comp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int result = BinarySearch(Integer.parseInt(st.nextToken()));
			if (result != -1)
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}
	}

	private static int BinarySearch(int a) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] < a)
				left = mid + 1;
			else if (arr[mid] > a)
				right = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}