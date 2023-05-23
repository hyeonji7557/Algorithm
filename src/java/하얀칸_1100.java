package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하얀칸_1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			if (i % 2 == 0) {
				for (int j = 0; j < 7; j += 2) {
					if (str.charAt(j) == 'F')
						count++;
				}
			} else {
				for (int k = 1; k < 8; k += 2) {
					if (str.charAt(k) == 'F')
						count++;
				}
			}
		}
		System.out.println(count);
	}
}