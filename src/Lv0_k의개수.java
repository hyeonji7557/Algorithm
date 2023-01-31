
public class Lv0_k의개수 {
	public int solution(int i, int j, int k) {
		int answer = 0;
		for (int t = i; t <= j; t++) {
			StringBuilder sb = new StringBuilder();
			sb.append(t);
			for (int z = 0; z < sb.length(); z++) {
				if ((sb.charAt(z) - '0') == k) {
					answer++;
				}
			}
		}
		return answer;
	}
}
