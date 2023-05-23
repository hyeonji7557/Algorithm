package java;

public class Lv0_숫자찾기 {
	public int solution(int num, int k) {
		int answer = 0;
		String str = String.valueOf(num);
		String a = String.valueOf(k);
		if (str.indexOf(a) == -1) {
			answer = -1;
		} else {
			answer = str.indexOf(a) + 1;
		}
		return answer;
	}
}
