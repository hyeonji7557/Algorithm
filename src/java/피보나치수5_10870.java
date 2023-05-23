package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5_10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = f(n);
		System.out.println(sum);
	}

	public static int f(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		return f(n - 1) + f(n - 2);
	}
}
