package java;
import java.util.Arrays;

public class Lv0_문자열정렬하기2 {
	public String solution(String my_string) {
		String answer = my_string.toLowerCase();
		char[] arr = answer.toCharArray();
		Arrays.sort(arr);
		answer = new String(arr);
		return answer;
	}
}
