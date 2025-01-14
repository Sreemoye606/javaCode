// create class, getter, setter 
// Ankan works as Developer with emailid ank@ibm.com and earns 5k per anum.

class Employee {
	private String ename;
	private int salary;
	private String designation;
	private String email;
	
	public String getEname(){
		return this.ename;
	}
	public void setEname(String ename){
		this.ename = ename;
	}
	
	public String getDesignation(){
		return this.designation;
	}
	public void setDesignation(String designation){
		this.designation = designation;
	}
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public int getSalary(){
		return this.salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	
}

class Q1_getterSetter {
	public static void main(String[] args){
		Employee a = new Employee();
		
		a.setEname("Ankan");
		String n = a.getEname();
		
		a.setDesignation("developer");
		String d = a.getDesignation();
		
		a.setEmail("ank@ibm.com");
		String em = a.getEmail();
		
		a.setSalary(5000);
		int s = a.getSalary();
		
		System.out.println(n+" works as "+d+" with emailid "+em+" and earns "+s+" per anum.");
	}
}