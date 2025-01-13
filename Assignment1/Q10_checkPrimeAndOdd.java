// check if given no. is prime and odd
class Q10_checkPrimeAndOdd{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		checkPrimeAndOdd(num);
	}
	
	static void checkPrimeAndOdd(int n) {
		int cnt = 0;
	
		for (int i = 2; i<=n/2 ; i++){
			if (n % i ==0){
				cnt++;
				break;
			}
		}
		if (n>1 && cnt<1){
			System.out.println("It is prime.");
		}
		else {
			System.out.println("It is not prime.");
		}
		
		if (n%2 != 0){
			System.out.println("It is odd.");
		}
		else {
			System.out.println("It is not odd.");
		}
	}
}