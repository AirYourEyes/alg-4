import edu.princeton.cs.algs4.*;

public class GCD_Apply1{

	public static long gcd(int p, int q){
		if (q == 0)
			return p;
		int r = p % q;
		return gcd(q, r);
	
	}

	public static void main(String args[]){
		while (true){
					
			StdOut.print("Please input the N: ");
			int N = StdIn.readInt();
			boolean[][] a = new boolean[N][N];

			for (int i = 0; i < N; i++){
				for (int j = 0; j < N; j++){
					if (gcd(i, j) == 1){
						a[i][j] = true;	
					}
				}
			}

			StdOut.println("The content of a: ");
			for (int i = 0; i < N; i++){
				StdOut.print("\t" + i);
			}
			StdOut.println();

			for (int i = 0; i < N; i++){
				StdOut.print(i + "\t");
				boolean flag = false;
				for (int j = 0; j < N; j++){
					if(flag){
						StdOut.print("\t");
					}
					else {
						flag = true;
					}
					StdOut.print(a[i][j]);
					//refresh a
					a[i][j] = false;
				}
				StdOut.println();
			}
		}
	}
}
