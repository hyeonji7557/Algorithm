package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2_중간평균값구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++)
				arr[j] = Integer.parseInt(st.nextToken());
			Arrays.sort(arr);
			for (int k = 1; k <= 8; k++)
				sum += arr[k];
			System.out.format("#%d %.0f\n", i, sum / 8.0);
			sum =0;
		}	
	}
}