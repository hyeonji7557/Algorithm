import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 열개씩끊어출력하기_11721 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		while(str.length() > 0) {
			if(str.length() < 10) {
				sb.append(str).append("\n");
				break;
			}
			sb.append(str.substring(0, 10)).append("\n");
			str = str.substring(10);
		}
		System.out.println(sb);
	}
}
