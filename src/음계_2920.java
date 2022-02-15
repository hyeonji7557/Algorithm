import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 음계_2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] num = new int[8];
		for (int i = 0; i < 8; i++)
			num[i] += Integer.parseInt(st.nextToken());
		if (Arrays.equals(arr1, num))
			System.out.println("ascending");
		else if (Arrays.equals(arr2, num))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}