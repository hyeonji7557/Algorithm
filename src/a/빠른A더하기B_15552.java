package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빠른A더하기B_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int tc = Integer.parseInt(str);
		for(int i=0;i<tc;i++) {
			String str1 = br.readLine();
			StringTokenizer st = new StringTokenizer(str1);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a + b);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
