class Q3_largestOf2Numbers{
	public static void main(String[] args){
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int l = 0;
		int s = 0;
		if (num1 > num2){
			l = num1;
		}
		else {
			l = num2 ;
		}
		System.out.println("largest of 2 numbers is = "+l);
		
		if (num1+num2 > num3){
			s = num3;
		}
		else {
			s = num1+num2;
		}
		System.out.println("smallest of 2 numbers is = "+s);
		
	}
}