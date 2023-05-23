package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class notcute_10886 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count1 = 0;
		int count0 = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			if (a == 1)
				count1++;
			else
				count0++;
		}
		if (count1 > count0)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");
	}
}