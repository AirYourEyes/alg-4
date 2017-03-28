	//1、颠倒数组的元素的顺序
	public static <T> void arrayReverse(T[] a){
		int N = a.length;
		for (int i = 0; i < N/2; i++){
			T temp = a[i];
			a[i] = a[N-1-i];
			a[N-1-i] = temp;
		}
	}
