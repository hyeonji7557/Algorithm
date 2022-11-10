
public class Lv0_피자나눠먹기1 {
	public int solution(int n) {
		int answer = 0;
		while (n > 0) {
			n -= 7;
			answer++;
		}
		return answer;
	}

}
