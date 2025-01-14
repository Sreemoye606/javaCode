// Create a java class that will check whether a person's name is palindrome or not.

class Palindrome {
	boolean isPalindrome(String n){
		String rev = "";
		
		for (int i=n.length()-1 ; i>=0 ; i--){
			rev += n.charAt(i);
		}
		
		if (n.equals(rev))
			return true;
		else
			return false;
	}
}

class Q9_palindrome{
	public static void main(String[] args){
		Palindrome c = new Palindrome();
		String name = args[0];
		
		if (c.isPalindrome(name)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
			
		}
		
	}
}