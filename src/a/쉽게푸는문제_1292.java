package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 쉽게푸는문제_1292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] arr = new int[1002];
		int sum = 0;
		int k = 1;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= i; j++) {
				if (k == 1001)
					break;
				arr[k] = i;
				k++;
			}
		}
		for (int i = a; i <= b; i++)
			sum += arr[i];
		System.out.println(sum);
	}
}