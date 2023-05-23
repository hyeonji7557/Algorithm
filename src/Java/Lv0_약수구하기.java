package java;

public class Lv0_약수구하기 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer[count] = i;
				count++;
			}
		}
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = answer[i];
		}
		return arr;
	}
}
