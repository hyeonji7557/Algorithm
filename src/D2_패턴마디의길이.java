import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_패턴마디의길이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			String str = br.readLine();
			for (int j = 1; j <= 10; j++) {
				if (str.substring(0, j).equals(str.substring(j, j * 2))) {
					System.out.println("#" + i + " " + j);
					break;
				}
			}
		}
	}
}