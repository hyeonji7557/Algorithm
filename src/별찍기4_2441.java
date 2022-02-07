import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 별찍기4_2441 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j < n; j++)
				System.out.print(" ");
			for (int k = n - i; k > 0; k--) 
				System.out.print("*");
			System.out.println();
		}
	}
}