import java.util.Scanner;

public class PositiveIntToBinary{
	
	public static String convert(int N){
		String str = "";
		for (int n = N; n > 0; n /= 2){
			str = (n % 2) + str;
		}
		return str;
	}

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		System.out.println(convert(N));
	}
}
