
public class Lv0_제곱수판별하기 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (n == i * i) {
				answer = 1;
			}
		}
		if (answer == 0) {
			answer = 2;
		}

		return answer;
	}
}
