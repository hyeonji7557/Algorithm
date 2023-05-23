package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 뒤집힌덧셈_1357 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int a = Rev(x);
		int b = Rev(y);
		int res = Rev(a + b);
		System.out.println(res);
	}
	private static int Rev(int N) {
        String str = "";
        while (N > 0) {
            str += N % 10;
            N /= 10;
        }
        return Integer.parseInt(str);
    }
}