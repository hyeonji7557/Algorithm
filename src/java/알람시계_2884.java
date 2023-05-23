package java;
import java.util.Scanner;

public class 알람시계_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if (45 <= m && m <= 59)
			m -= 45;
		else {
			if (h == 0)
				h = 23;
			else
				h -= 1;
			m += 15;
		}
		System.out.println(h + " " + m);
	}
}
