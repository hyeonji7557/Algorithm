package java;

public class Lv0_주사위의개수 {
	public int solution(int[] box, int n) {
		int answer = 1;
		for (int i = 0; i < box.length; i++) {
			answer *= (box[i] / n);
		}
		return answer;
	}
}
