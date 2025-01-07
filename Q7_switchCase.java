// take 3 stings from command line and if their length is greater than 3 greet the user
class Q7_switchCase{
	public static void main(String[] args){
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		System.out.println(check(s1, s2, s3));
		
	}
	
	static String check(String s1, String s2, String s3){
		
		int lenT = calcLength(s1, s2, s3);
		String res = switch(lenT){
			case 0, 1, 2, 3 -> "Invalid String";
			default -> "Welcome user";
		};
		
		return res;
	}
	
	static int calcLength(String s1, String s2, String s3){
		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();
		int lT = l1+l2+l3;
		return lT;
	}
}