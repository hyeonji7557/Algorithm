package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_백만장자프로젝트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			int a = Integer.parseInt(br.readLine());
			int[] arr = new int[a];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++)
				arr[j] = Integer.parseInt(st.nextToken());
			long sum = 0;
			long max = arr[a - 1];
			int end = a - 1;
			for (int k = arr.length - 1; k >= 0; k--) {
				if (arr[k] > max) {
					for (int z = k + 1; z < end; z++) {
						sum += (-arr[z] + max);
					}
					max = arr[k];
					end = k;
				} else if (k == 0) {
					for (int z = 0; z < end; z++) {
						sum += (-arr[z] + max);
					}
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}