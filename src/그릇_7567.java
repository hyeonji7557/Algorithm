import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그릇_7567 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = 10;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1))
				a += 5;
			else
				a += 10;
		}
		System.out.println(a);
	}
}