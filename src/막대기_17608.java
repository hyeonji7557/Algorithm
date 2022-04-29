import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 막대기_17608 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		int count = 1;
		int max = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (max < arr[i]) {
				max = arr[i];
				count++;
			}
		}
		System.out.println(count);
	}
}