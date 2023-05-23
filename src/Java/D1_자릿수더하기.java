package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_자릿수더하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = s.charAt(i) - '0';
			sum += a;
		}
		System.out.println(sum);
	}
}