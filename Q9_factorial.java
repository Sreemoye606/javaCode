//factorial of a number
class Q9_factorial{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		System.out.println("factorial of "+num +" is "+findFact(num));
	}
	
	static int findFact(int n) {
		int fact = 1;
		for (int i = 1; i <= n ; i++){
			fact = fact*i;
		}
		return fact;
	}
}