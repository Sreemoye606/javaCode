// check if given no. is prime and odd
//factorial of a number
class Q10_checkPrimeAndOdd{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		System.out.println("factorial of "+num +" is "+findFact(num));
	}
	
	static void checkPrimeAndOdd(int n) {
		int cnt = 0;
		for (int i = 1; i<=n/2 ; i++){
			if (n % i ==0){
				cnt
				break;
			}
		}
	}
}