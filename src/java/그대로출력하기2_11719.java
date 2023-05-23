package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 그대로출력하기2_11719 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String a = sc.nextLine();
			System.out.println(a);
		}
	}
}