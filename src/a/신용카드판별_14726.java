package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 신용카드판별_14726 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (j % 2 == 0) {
					int a = (str.charAt(j) - '0') * 2;
					if (a >= 10)
						sum += (a / 10) + (a % 10);
					else
						sum += a;
				} else
					sum += str.charAt(j) - '0';
			}
			if (sum % 10 == 0)
				System.out.println("T");
			else
				System.out.println("F");
			sum = 0;
		}
	}
}