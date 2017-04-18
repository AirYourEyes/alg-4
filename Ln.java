import edu.princeton.cs.algs4.*;

public class Ln{

	public static double ln(int N){
		if (N == 1){
			return 0;
		}
		return Math.log(N)+ln(N-1);
	
	}

	public static void main(String args[]){
		int N = StdIn.readInt();
		StdOut.println("ln(" + N + ") = " + ln(N));
	}
}
