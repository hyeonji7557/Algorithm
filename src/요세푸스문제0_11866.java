import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제0_11866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= n; i++)
			q.add(i);
		sb.append('<');
		while(q.size() > 1) {
			for(int i = 0; i < k - 1; i++)
				q.offer(q.poll());
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
}