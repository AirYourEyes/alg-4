//二分查找，找到的话返回所在位置，若找不到的话，返回-1
	public static int binarySearch(int key, int[] a){
		int low = 0;
		int high = a.length - 1;
		while (low <= high){
			int mid = low + (high - low) / 2;
			if (key < a[mid]){
				high = mid - 1;
			}
			else if (key > a[mid]){
				low = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
