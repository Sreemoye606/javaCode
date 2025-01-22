/*
6. create an array of 5 integers then convert all elements to string and store in another array and print
*/

class Q6_convertIntegerArrayToStringArray{
	
	static String[] intToString(int[] arr){
		String s[] = new String[5];
		for (int i=0; i<arr.length ; i++){
			s[i] = Integer.toString(arr[i]);
		}
		return s;
	}
	
	public static void main(String[] args){
		int a[] = {1,2,3,4,5};
		String s[] = intToString(a);
		
		for (int i=0; i<s.length ; i++){
			System.out.println(s[i]);
			
		}
	}
}