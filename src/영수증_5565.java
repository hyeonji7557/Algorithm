import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영수증_5565 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine());
		int sum1 = 0;
		for (int i = 0; i < 9; i++)
			sum1 += Integer.parseInt(br.readLine());
		System.out.println(sum - sum1);
	}
}