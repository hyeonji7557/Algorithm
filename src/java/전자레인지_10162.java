package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전자레인지_10162 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		int c = 0;
		if (t >= 300) {
			a = t / 300;
			t = t % 300;
		}
		if (t >= 60) {
			b = t / 60;
			t = t % 60;
		}
		if (t >= 10) {
			c = t / 10;
			t = t % 10;
		}
		System.out.println(t == 0 ? a + " " + b + " " + c : -1);
	}
}