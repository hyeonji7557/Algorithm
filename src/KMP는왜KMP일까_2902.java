import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMP는왜KMP일까_2902 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String a = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				a += str.charAt(i);
		}
		System.out.println(a);
		
	}
}