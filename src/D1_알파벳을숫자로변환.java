import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_알파벳을숫자로변환 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++)
			System.out.print(((int) s.charAt(i) - 64) + " ");
	}
}