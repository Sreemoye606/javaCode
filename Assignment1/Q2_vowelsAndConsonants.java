class Q2_vowelsAndConsonants{
	public static void main(String[] args){
		
		String name = args[0];
		check(name);
	}
	
	static void check(String name){
		String vowels = "aeiouAEIOU";
		int cntV = 0;
		int cntC = 0;
		
		int i =0;
		while (i < name.length()){
			int j = 0;
			char n = name.charAt(i);
			
			while (j < vowels.length()){
				char v = vowels.charAt(j);
				if (n==v){
					cntV++;
				}
				
				j++;
			}
			
			i++;
		}
		cntC = name.length() - cntV;
		System.out.println("No. of vowels = "+cntV);
		System.out.println("No. of consonats = "+cntC);
	}
}