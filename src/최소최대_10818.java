import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최소최대_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[n];
		for (int i = 0; i < n; i++)
			A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);
		System.out.println(A[0] + " " + A[n-1]);
	}

}
