import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Delete{

	public static int rank(int a[], int key){
		return rank(a, key, 0, a.length-1);
	}

	private static int rank(int a[], int key, int lo, int hi){
		if (lo > hi){
			return -1;
		}
		int mid = (lo + hi) / 2;
		if (key > a[mid]){
			return rank(a, key, mid+1, hi);
		} else if (key < a[mid]){
			return rank(a, key, lo, mid-1);
		} else {
			return mid;
		}
	}

	public static void main(String args[]){
		StdOut.print("Please input the size of the white list: ");
		int n = StdIn.readInt();
		int[] wl = new int[n];
		for (int i = 0; i < n; i++){
			StdOut.print("Please input number " + (i+1) + ": ");
			wl[i] = StdIn.readInt();
		}
		Arrays.sort(wl);
		StdOut.print("After delete all repeate elements: ");
		StdOut.print(wl[0]);
		for (int i = 1; i < n; i++){
			int p = rank(wl, wl[i-1]);
			int q = rank(wl, wl[i]);
			if (p != q){
				StdOut.print("\t" + wl[i]);
			}
		
		}
	}
}
