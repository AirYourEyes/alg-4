
public class FastFibonacci2{

	private static long g(int N, long[] tmp){
		if (tmp[N] != -1) 
			return tmp[N];
		else {
			return tmp[N] = g(N-1, tmp) + g(N - 2, tmp);
		}
	}

	public static long f(int N){
		long[] tmp = new long[200];
		tmp[0] = 0;
		tmp[1] = 1;
		for (int i = 2; i < 200; i++){
			tmp[i] = -1;
		}
		return g(N, tmp);
	}

	public static void main(String args[]){
		for (int N = 0; N < 100; N++){
			System.out.println(N + " " + f(N));
		}
	}
}

