import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;
		if (n == 1)
			System.out.print(1);
		else {
			while (range <= n) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
	}
}
