package java;

public class Lv0_배열뒤집기 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		int a = num_list.length;
		for (int i = 0; i < num_list.length; i++) {
			answer[a - 1] = num_list[i];
			a--;
		}
		return answer;
	}
}
