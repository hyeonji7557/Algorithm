package java;

public class Lv0_양꼬치 {
	public int solution(int n, int k) {
		int answer = 0;
		int a = 0;
		if (n >= 10) {
			a = n / 10;
		}
		answer = n * 12000 + k * 2000 - a * 2000;
		return answer;
	}
}
