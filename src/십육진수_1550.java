import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 십육진수_1550 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		System.out.println(Integer.parseInt(a, 16));
	}
}