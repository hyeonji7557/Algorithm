package java;

public class Lv0_피자나눠먹기2 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i < 10; i++) {
			if ((n * i) % 6 == 0) {
				answer = (n * i) / 6;
				break;
			}
		}
		return answer;
	}
}
