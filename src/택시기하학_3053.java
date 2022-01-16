import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 택시기하학_3053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		System.out.println(r * r * Math.PI);
		System.out.println(2 * r * r);
	}
}