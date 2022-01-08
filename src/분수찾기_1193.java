import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기_1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int start = 1;
		int i = 1;
		while ((start + i) <= x) {
			start += i;
			i++;
		}
		int distance = x - start;
		boolean dir = false;
		if (i % 2 == 0)
			dir = true;
		if (dir) {
			int a = 1;
			int b = i;
			System.out.println((a + distance) + "/" + (b - distance));
		} else {
			int a = i;
			int b = 1;
			System.out.println((a - distance) + "/" + (b + distance));
		}
	}
}