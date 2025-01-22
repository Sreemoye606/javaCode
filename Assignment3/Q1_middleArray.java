/* Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]
*/

class Q1_middleArray{
	
	static int[] middle(int[] arr){
		int m[] = new int[arr.length - 2];
		for (int i=1; i<arr.length-1 ; i++){
			m[i-1] = arr[i];
		}
		return m;
	}
	
	public static void main(String[] args){
		int a[] = {12, 5, 7, 45, 78, 90, 122};
		int res[] = middle(a);
		for (int i=0; i<res.length ; i++){
			System.out.println(res[i]);
		}
	}
}