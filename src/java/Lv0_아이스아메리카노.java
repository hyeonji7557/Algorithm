package java;

public class Lv0_아이스아메리카노 {
	public int[] solution(int money) {
		int[] answer = new int[2];
		while (money >= 5500) {
			answer[0]++;
			money -= 5500;
		}
		answer[1] = money;
		return answer;
	}
}
