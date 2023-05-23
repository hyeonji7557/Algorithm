package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기17_10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--)
				System.out.print(" ");
			System.out.print("*");
			if (i != n - 1) {
				for (int j = 0; j < 2 * i - 1; j++)
					System.out.print(" ");
			} else {
				for (int j = 0; j < n * 2 - 3; j++)
					System.out.print("*");
			}
			if (i > 0)
				System.out.print("*");
			System.out.println();
		}
	}
}