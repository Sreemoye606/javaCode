/*
Apply Has-A relationship to create the following
   A person HAS AN address.(USE LOMBOK)
   */
import lombok.*;

@Getter
@Setter
class Person {
	private String name;
	private String address;
}

class Q6_lombokImplementation{
	public static void main(String[] args){
		Person p = new Person();
		p.setName("Roshni");
		p.setAddress("Kolkata, West Bengal");
		
		System.out.println(p.getName()+" HAS AN address: "+p.getAddress());
	}
}
