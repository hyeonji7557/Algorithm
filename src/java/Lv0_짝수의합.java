package java;

public class Lv0_짝수의합 {
	public int solution(int n) {
		int answer = 0;
		int a = 2;
		while (a <= n) {
			answer += a;
			a += 2;
		}
		return answer;
	}

}
