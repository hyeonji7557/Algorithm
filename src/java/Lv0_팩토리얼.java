package java;

public class Lv0_팩토리얼 {
	public int solution(int n) {
		int answer = 1;
		while (n > 0) {
			if (n / answer == 0) {
				return answer - 1;
			} else {
				n = n / answer;
				answer++;
			}
		}
		return answer;
	}
}
