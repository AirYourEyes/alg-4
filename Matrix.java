import edu.princeton.cs.algs4.*;

public class Matrix{
	
	public static double dot(double[] x, double[] y){
		double s = 0;
		if (x.length == y.length){
			for (int i = 0; i < x.length; i++){
				s += x[i] * y[i];	
			}
			return s;
		} else {
			throw new RuntimeException("Error: the length of x is not equal to y's length");
		}
	}

	public static double[][] mult(double[][] a, double[][] b){

		if (a[0].length != b.length){
			throw new RuntimeException("Error: the column number of a is not equal to y' rows number");
		} else {
			double[][] c = new double[a.length][b[0].length];
			double[][] d = transpose(b);
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < b[0].length; j++){
					c[i][j] = dot(a[i], d[j]);
				}
			}
			return c;
		}
		
	}

	public static double[][] transpose(double[][] a){
		double[][] b = new double[a[0].length][a.length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[0].length; j++){
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

	public static double[] mult(double[] y, double[][] a){
		if (y.length != a.length){
			throw new RuntimeException("Error: the cols of y is not equal to a");
		} else{
			double[] x = new double[a[0].length];
			for (int i = 0; i < x.length; i++){
				x[i] = dot(y, a[i]);
			}
			return x;
		}
	}


	public static void main(String args[]){
		double[] y = {1, 2};
		double[][] a = {{1, 3}, {2, 4}};
		double[] x = mult(y, a);
		for (int i = 0; i < x.length; i++){
			StdOut.print(x[i] + "\t");
		}
	}

}
