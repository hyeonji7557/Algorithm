
public class Lv1_신규아이디추천 {

	public String solution(String s) {
		s = s.toLowerCase();

		String t = "";
		char[] arr = s.toCharArray();
		for (char a : arr) {
			if ((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9') || (a == '-') || (a == '_') || (a == '.'))
				t += String.valueOf(a);
		}
		s = t;

		while (s.contains("..")) {
			s = s.replace("..", ".");
		}

		if (s.length() > 0) {
			if (s.charAt(0) == '.')
				s = s.substring(1, s.length());
		}
		if (s.length() > 0) {
			if (s.charAt(s.length() - 1) == '.')
				s = s.substring(0, s.length() - 1);
		}

		if (s.equals(""))
			s = "a";

		if (s.length() >= 16) {
			s = s.substring(0, 15);
			if (s.charAt(s.length() - 1) == '.')
				s = s.substring(0, s.length() - 1);
		}

		if (s.length() <= 2) {
			char a = s.charAt(s.length() - 1);
			while (s.length() < 3) {
				s += String.valueOf(a);
			}
		}
		
		return s;
	}
}
