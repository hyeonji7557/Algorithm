package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		int cnt = 0;
		int score = 0;
		for (int i = 0; i < n; i++)
			str[i] = br.readLine();
		for (String s : str) {
			for (int i = 0; i < s.length(); i++) {
				char quiz = s.charAt(i);
				if (quiz == 'O') {
					cnt++;
					score += cnt;
				} else
					cnt = 0;
			}
			System.out.println(score);
			score = 0;
			cnt = 0;
		}
	}
}
