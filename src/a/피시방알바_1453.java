package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피시방알바_1453 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[101];
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			int person = Integer.parseInt(st.nextToken());
			if(arr[person] == true)
				count++;
			else
				arr[person] = true;
		}
		System.out.println(count);
	}
}