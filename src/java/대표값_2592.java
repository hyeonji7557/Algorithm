package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대표값_2592 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[1001];
		int sum = 0;
		int mode = 0;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a]++;
			sum += a;
		}
		System.out.println(sum / 10);
		for (int i = 0; i < 1001; i++) {
			if (arr[i] > max) {
				max = arr[i];
				mode = i;
			}
		}
		System.out.println(mode);
	}
}