package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나누기_1075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		int num = (n / 100) * 100;
		while (true) {
			if (num % f == 0) {
				int result = num % 100;
				if (result < 10)
					System.out.println("0" + result);
				else
					System.out.println(result);
				return;
			}
			num++;
		}
	}
}