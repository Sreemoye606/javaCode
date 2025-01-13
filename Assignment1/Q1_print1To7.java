class Q1_print1To7{
	public static void main(String[] args){
		printNum();
				
		}
	
	static void printNum(){
		for (int i=1 ; i<=7 ; i++){
			if (i != 3 && i != 5)
				System.out.println(i);
			else
				System.out.println("I am "+i);
				
		}
	}
}