//user login using witch case
class Q6_userLogin{
	public static void main(String[] args){
		String s1 = args[0];
		String s2 = args[1];
		
		checkLogin(s1, s2);
		
	}
	
	static void checkLogin(String u, String p){
		switch(u) {
			case "ankan","souparna": {
				switch(p){
					case "Madhu","trisha": {
						System.out.println("Welcome user!");
						break;
					}
					default: {
						System.out.println("Wrong password.");
						break;
					}
				}
				break;
			}
			default:{
				System.out.println("Wrong username.");
			}

		}
	}
}