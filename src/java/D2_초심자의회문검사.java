package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_초심자의회문검사 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			String str = br.readLine();
			int flag = 1;
			for (int j = 0; j < str.length() / 2; j++) {
				if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
					flag = 0;
					break;
				}
			}
			System.out.println("#" + i + " " + flag);
		}
	}
}