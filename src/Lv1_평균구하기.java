
public class Lv1_평균구하기 {

	public double solution(int[] arr) {
		double answer = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
			count++;
		}
		answer = answer / count;
		return answer;
	}
}