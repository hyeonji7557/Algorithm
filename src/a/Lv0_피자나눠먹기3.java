package java;

public class Lv0_피자나눠먹기3 {
	public int solution(int slice, int n) {
		int answer = 0;
		while (n >= slice) {
			n -= slice;
			answer++;
		}
		if (n > 0) {
			answer += 1;
		}
		return answer;
	}
}
