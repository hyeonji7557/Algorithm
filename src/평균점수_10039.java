import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균점수_10039 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int a = Integer.parseInt(br.readLine());
			if (a < 40)
				a = 40;
			sum += a;
		}
		System.out.println(sum / 5);
	}
}