package java;
import java.util.Scanner;

public class 구구단_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i=1; i<10; i++)
			System.out.println(dan + " * " + i + " = " + (dan*i));
	}
}