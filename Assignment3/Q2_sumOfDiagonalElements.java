/*
Given 1D array calculate the sum of diagonal elements.

Example

myArray2D= {1,2,3,4,5,6};
sumDiagonalElements(myArray2D) # 21
*/

class Q2_sumOfDiagonalElements{
	static int sumDiagonalElements(int[] arr){
		int sum =0;
		for (int i=0; i<arr.length ; i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args){
		int myArray1D[] = {1,2,3,4,5,6};
		System.out.println(sumDiagonalElements(myArray1D));
	}
}