import edu.princeton.cs.algs4.*;

public class UF{
	private int[] id;
	private int count;

	public UF(int N){
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++){
			id[i] = 0;
		}
	}

	public int count(){
		return count;
	}

	public boolean connected(int p, int q){
		return find(p) == find(q);
	}

	public int find(int p){
		return id[p];
	}

	public void union(int p, int q){
		int pID = find(p);
		int qID = find(q);

		if (pID == qID){
			return;
		}

		for (int i = 0; i < id.length; i++){
			if (id[i] == pID){
				id[i] = qID;
			}
		}
		count--;
	}
	
	public static void main(String args[]){
		int N = StdIn.readInt();
		UF uf = new UF(N);
		while (!StdIn.isEmpty()){
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (uf.connected(p, q)){
				continue;
			}
			uf.niion(p, q);
			StdOut.println(ur.count() + "compnents");

		}
		
	}
}
