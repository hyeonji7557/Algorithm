package java;

public class Lv0_문자열안에문자열 {

	public int solution(String str1, String str2) {
		int answer = 0;
		if (str1.contains(str2)) {
			answer = 1;
		} else {
			answer = 2;
		}
		return answer;
	}
}
