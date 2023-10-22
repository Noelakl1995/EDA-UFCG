package Exos;

public class Quadradoperf {
	public char nextGreatestLetter(char[] letters, char target) {
        return busca(letters, target);
    }


    public char busca(char[] letters, char target){
    	int left = 0;
    	int right = letters.length - 1;
        if(left <= right){
            int middle = (left + right)/2;
            if(target <= letters[right]){
                return letters[0];
            }
            else if(target < letters[middle]){
                left = middle - 1;
            }
            else{
                right = middle + 1;
            }
        }
        return letters[left];

    }
		
	

}
