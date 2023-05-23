package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1_최대수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int max = Integer.parseInt(st.nextToken());
			for (int j = 0; j < 9; j++) {
				int a = Integer.parseInt(st.nextToken());
				if (max < a)
					max = a;
			}
			System.out.println("#" + i + " " + max);
		}
	}
}