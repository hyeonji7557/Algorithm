package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기6_2443 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int k = 0; k < 2 * (n - i) - 1; k++)
				System.out.print("*");
			System.out.println(" ");
		}
	}
}