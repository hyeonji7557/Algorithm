package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나는요리사다_2953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) 
				arr[i] += Integer.parseInt(st.nextToken());
		}
		int count = 0;
		for(int i =1; i <5; i++) {
			if(arr[count] < arr[i])
				count = i;
		}
		System.out.println((count+1)+ " " + arr[count]);
	}
}