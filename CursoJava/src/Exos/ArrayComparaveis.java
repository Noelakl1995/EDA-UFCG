package Exos;

public class ArrayComparaveis {
	
	public static  int ceil(int[] array, int left, int right, int x) {
		int result = -1;
		if(left <= right && left >= 0 && array.length >= right) {
			int middle = (left + right)/2;
			
			if(x == array[middle]) {
				return x;
			}
			else if(x > array[middle + 1]) {
				if(array[middle] > x) {
					result = array[middle];
				}else {
					result = ceil(array, x, middle + 1, right);
				}
			}else {
				result = ceil(array, x, left, middle - 1);
			}
			
			
		}
		
		return result;
	}
	
	
	
	private int floor(Integer[] array, int x, int left, int right) {
		int result = -1;
		if(left <= right && left >= 0 && right <= array.length) {
			int middle = (left + right)/2;
			if(x == array[middle]) {
				return x;
			}
			else if(x < array[middle]) {
				if(array[middle - 1] < x) {
					result = array[middle - 1];
				}
				else {
					result = floor(array, x, left, middle - 1);
				}
			}else {
				result = floor(array, x, middle + 1, right);
			}
		}
		return result;
	}

}
