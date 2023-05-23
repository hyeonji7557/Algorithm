package java;

public class Lv0_암호해독 {
	public String solution(String cipher, int code) {
		String answer = "";
		for (int i = code; i <= cipher.length();) {
			answer += cipher.charAt(i - 1);
			i = i + code;
		}
		return answer;
	}
}
