import java.util.Scanner;
public class DecToDiffBaseTool{

	public static String convert(int N, int base){
		if (base <= 0){
			throw new RuntimeException("The base can't be less and equals to 0");
		}

		if (N < 0){
			N = Integer.MAX_VALUE + N + 1;
		}

		String res = "";

		if (N == 0){
			res = "0";
		}

		for (int n = N; n > 0; n /= 2){ 
			res = (n % 2) + res;
		}
		
		return res;
	}

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input the N that want to be convert:");
		int N = keyboard.nextInt();
		System.out.print("Please input the Base:");
		int B = keyboard.nextInt();
		String res = convert(N, B);
		System.out.println("The " + B + "-base represent of " + N +  " is:" + res);
	}
}
