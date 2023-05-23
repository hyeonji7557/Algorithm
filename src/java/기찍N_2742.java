package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기찍N_2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		StringBuilder sb = new StringBuilder();
		for(int i=n;i>0;i--)
			sb.append(i).append("\n");
		System.out.println(sb);
	}
}
