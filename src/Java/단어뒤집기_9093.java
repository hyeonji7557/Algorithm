package java;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 단어뒤집기_9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<Character>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (num-- > 0) {
			String input = br.readLine() + "\n";
			for (char ch : input.toCharArray()) {
				if (ch == ' ' || ch == '\n') {
					while (!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				} else
					stack.push(ch);
			}
		}
		bw.flush();
		return;
	}
}