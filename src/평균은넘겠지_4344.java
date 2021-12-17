import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		for (int i = 0; i < c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			double sum = 0;
			double count = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double avg = sum / n;
			for (int j = 0; j < n; j++) {
				if (arr[j] > avg)
					count++;
			}
			System.out.printf("%.3f%%\n", (count / n) * 100);
		}
	}
}