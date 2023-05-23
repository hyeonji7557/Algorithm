package java;

public class Lv0_특정문자제거하기 {
	public String solution(String my_string, String letter) {
		String answer = "";
		answer = my_string.replaceAll(letter, "");
		return answer;
	}
}
