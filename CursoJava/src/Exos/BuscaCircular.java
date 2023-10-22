package Exos;

public class BuscaCircular {
	public static int achatPivot(int[] array, int min, int max) {
		if(array.length > 0 && min >= 0 && max >= min && max >= array.length) {
			int middle = (min + max)/2;
			
			if(middle < max && array[middle] < array[middle + 1]) {
				return middle;
			}
			
			if(middle > min && array[middle - 1] < array[middle]) {
				return middle - 1;
			}
			
			else if(array[min] <= array[middle]) {
				achatPivot(array, min, middle - 1);
			}
			else {
				achatPivot(array, middle + 1, max);
			}
			
		}
		
		
		
		return -1;
	}
	
	

}
