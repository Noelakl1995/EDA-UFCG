package Exos;

public class CircularArrayImp implements CircularArray {

	@Override
	public int findRotation(int[] array) {
		int left = 0;
		int right = array.length - 1;
		
		while(left < right){
			int mid = left + (right - left)/2;
			
			if(mid < right && array[mid] > array[right]) {
				return mid + 1;
			}
			
			if(mid > left && array[mid] < array[left]) {
				return mid;
			}
			
			if(array[left] < array[mid]) {
				left = mid + 1;
			}
			
			else {
				right = mid - 1;
			}
			
		}
		
		
		
		return 0;
	}

	

}
