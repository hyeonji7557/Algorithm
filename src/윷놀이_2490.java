import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 윷놀이_2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[2];
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				int a = Integer.parseInt(st.nextToken());
				if (a == 0)
					arr[0] += 1;
				else
					arr[1] += 1;
			}
			if(arr[0] == 1)
				System.out.println("A");
			else if(arr[0] == 2)
				System.out.println("B");
			else if(arr[0] == 3)
				System.out.println("C");
			else if(arr[0] == 4)
				System.out.println("D");
			else
				System.out.println("E");
			arr[0] = 0;
			arr[1] = 0;
		}
	}
}