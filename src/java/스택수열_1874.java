package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열_1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if (num > a) {
				for (int i = a + 1; i <= num; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				a = num;
			} else if (stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}
}