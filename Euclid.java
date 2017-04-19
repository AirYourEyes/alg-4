import edu.princeton.cs.algs4.*;

public class Euclid{

	public static int gcd(int p, int q){
		StdOut.println("p = " + p + ", q = " + q);
		if (q == 0){
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}

	public static void main(String args[]){
		int p =  StdIn.readInt();
		int q = StdIn.readInt();
		StdOut.println("gcd(" + p + ", " + q + ") = " + gcd(p, q));
	}
}
