package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 십부제_10797 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		for (int i = 0; i < 5; i++) {
			int car = Integer.parseInt(st.nextToken());
			if (day == car)
				count++;
		}
		System.out.println(count);
	}
}