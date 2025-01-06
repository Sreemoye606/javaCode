//sum of even no, from 1 to 20
class Q5_sumOfEvenNo1To20{
	public static void main(String[] args){
		int s = 0;
		for (int i=1 ; i<=20 ; i++){
			if (i%2 == 0)
				s = s+i;
		}
		System.out.println("Sum of even no. "+s);
		
	}
}