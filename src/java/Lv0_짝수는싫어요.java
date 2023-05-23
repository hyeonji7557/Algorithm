package java;

public class Lv0_짝수는싫어요 {
	public int[] solution(int n) {
		int[] answer = new int[(n / 2) + (n % 2)];
		int a = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[a] = i;
				a++;
			}
		}
		return answer;
	}
}
