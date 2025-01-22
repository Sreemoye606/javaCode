/*Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
*/

class Q3_firstAndSecondBestScore{
	
	static int[] firstSecond(int[] arr){
		int m = arr[0];
		for (int i : arr){
			if (i > m) {
				m = i;
			}
		}
		
		int sm = arr[0];
		for (int j =0; j<arr.length ; j++) {
			if (arr[j] > sm && arr[j] < m){
				sm = arr[j];
			}
		}
		int a[] =  {m, sm};
		return a;
	}
	
	public static void main(String[] args){
		int a[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		int res[] = firstSecond(a);
		for (int i=0; i<res.length ; i++){
			System.out.println(res[i]);
		}
		
	}
}