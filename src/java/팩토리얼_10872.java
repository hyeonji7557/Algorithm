package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = factorial(n);
		System.out.println(sum);
	}
	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}
}
