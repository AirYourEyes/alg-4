
public class FastFibonacci{

	public static long f(int N){
		if (N == 0) return 0;
		if (N == 1) return 1;
		long res = 0;
		long a = 0;
		long b = 1;
		for(int i = 2; i <= N; i++){
			res = a + b;
			a = b;
			b = res;
		}
		return res;
	}
	
	public static void main(String args[]){
		for (int N = 0; N < 100; N ++){
			System.out.println(N + " " + f(N));
		}
	}
}
