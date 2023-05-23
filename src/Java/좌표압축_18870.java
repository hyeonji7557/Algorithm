package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 좌표압축_18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] origin = new int[n];
		int[] sorted = new int[n];
		HashMap<Integer, Integer> Map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sorted);
		int rank = 0;
		for (int v : sorted) {
			if (!Map.containsKey(v)) {
				Map.put(v, rank);
				rank++;
			}
		}
		for (int key : origin) {
			int ranking = Map.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
	}
}