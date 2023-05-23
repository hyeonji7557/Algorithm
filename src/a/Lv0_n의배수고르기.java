package java;

public class Lv0_n의배수고르기 {
	public int[] solution(int n, int[] numlist) {
		int[] answer = new int[numlist.length];
		int count = 0;
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer[count] = numlist[i];
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
