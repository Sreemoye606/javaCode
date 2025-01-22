/*
7. create an array of 5 doubles then reverse the array then print sum of both array elements
*/

class Q7_sumOfDoubleArrays{
	
	static double[] reverse(double[] arr){
		double s[] = new double[5];
		for (int i=0 ; i<arr.length ; i++){
			s[i] = arr[arr.length-1-i];
		}
		return s;
	}
	
	public static void main(String[] args){
		double a[] = {1.5,2.7,3.8,4.34,5.90};
		double s[] = reverse(a);
		
		for (int i=0; i<s.length ; i++){
			System.out.println(a[i]+s[i]);
			
		}
	}
}