package java;
import java.util.Arrays;

public class Lv0_최댓값만들기1 {
	public int solution(int[] numbers) {
		int answer;
		Arrays.sort(numbers);
		answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		return answer;
	}
}
