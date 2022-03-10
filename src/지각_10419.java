import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 지각_10419 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int max = 0;
		for (int i = 0; i < t; i++) {
			int d = Integer.parseInt(br.readLine());
			for (int j = 0; j <= 100; j++) {
				if (j + (j * j) <= d) 
					max = j;
			}
			System.out.println(max);
		}
	}
}