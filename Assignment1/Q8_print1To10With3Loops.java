//print 1 to 10 using for, while and do while loops in 3 different static methods

class Q8_print1To10With3Loops{
	public static void main(String[] args){
		for10();
		while10();
		dowhile10();
		
	}
	static void for10(){
		System.out.println("for loop:");
		
		for (int i=1 ; i<=10 ; i++){
			
			System.out.println(i);
				
		}
	}
	static void while10(){
		System.out.println("while loop:");
		
		int i = 1;
		while (i <= 10){
			
			System.out.println(i);
			i++;
		}
	}
	static void dowhile10(){
		System.out.println("do while loop:");
		
		int i = 1;
		do{
			
			System.out.println(i);
			i++;	
		}while(i <= 10);
	}
}