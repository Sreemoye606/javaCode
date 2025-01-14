/*8. Create a class to check where a student is elligible 2 vote in an election by checking age.
*/

class Student{
	private String name;
	private int age;
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
}

class Election{
	void ageCheck(Student s){
		if (s.getAge() >= 18){
			System.out.println(s.getName()+" is Eligible to vote");
		}
		else{
			System.out.println(s.getName()+" is Not Eligible to vote");
			
		}
	}
}

class Q8_eligibleToVote {
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setName("Rina");
		s2.setName("Mita");
		s3.setName("Rohan");
		
		s1.setAge(12);
		s2.setAge(19);
		s3.setAge(21);
		
		Election e = new Election();
		e.ageCheck(s1);
		e.ageCheck(s2);
		e.ageCheck(s3);
	
	}
}