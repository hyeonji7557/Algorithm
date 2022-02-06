import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳개수_10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[26];
		String s = br.readLine();
		for(int i = 0; i < s.length(); i++) 
			arr[s.charAt(i) - 97] += 1;
		for(int i = 0; i <arr.length; i++)
			sb.append(arr[i]).append(" ");
		System.out.println(sb);
	}
}