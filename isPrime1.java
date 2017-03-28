//判定一个数是否是素数
	public static boolean isPrime1(int N){
		if (N < 2){
			return false;
		}
		for (int i = 2; i*i <= N; i++){
			if(N % i == 0){
				return false;
			}
		}
		return true;
	}
