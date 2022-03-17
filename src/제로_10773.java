import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k; i++) {
			int number = Integer.parseInt(br.readLine());
			if (number == 0)
				stack.pop();
			else
				stack.push(number);
		}
		int sum = 0;
		for (int a : stack) {
			sum += a;
		}
		System.out.println(sum);
	}
}