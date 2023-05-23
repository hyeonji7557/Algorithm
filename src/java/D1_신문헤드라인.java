package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_신문헤드라인 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str.toUpperCase());
	}
}