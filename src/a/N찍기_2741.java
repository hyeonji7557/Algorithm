package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N찍기_2741 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(str);
		for(int i=1;i<=n;i++)
			sb.append(i).append("\n");
		System.out.println(sb);
	}
}
