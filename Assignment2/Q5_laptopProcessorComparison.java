// compare objects
/*Create a Java class Laptop with brand , price and processor type.
   Now Create HP LENOVO and DELL 3 laptops.
   Now Create an User class with username and address and the user should compare
   all processors and will puchase only Intel Core Ultra based laptop.
  */

class  Laptop{
	private String brand;
	private int price;
	private String processor;
	
	public String getBrand(){
		return this.brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public int getPrice(){
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	public String getProcessor(){
		return this.processor;
	}
	public void setProcessor(String processor){
		this.processor = processor;
	}
	
}

class User {
	private String uname;
	private String address;
	
	public String getUname(){
		return this.uname;
	}
	public void setUname(String uname){
		this.uname = uname;
	}
	
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	void compare(Laptop lap) {
		if (lap.getProcessor().equals("Intel Core Ultra")){
			System.out.println("user will buy "+lap.getBrand()+" laptop");
		}
		else {
			System.out.println("user will not buy "+lap.getBrand()+" laptop");
		}
	}
}

class Q5_laptopProcessorComparison {
	public static void main(String[] args){
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		
		l1.setBrand("HP");
		l2.setBrand("Lenovo");
		l3.setBrand("Dell");
		
		l1.setProcessor("Intel Core Ultra");
		l2.setProcessor("AMD Ryzen");
		l3.setProcessor("Intel core pro");
		
		l1.setPrice(15000);
		l2.setPrice(1500);
		l3.setPrice(4000);
		
		User u1 = new User();
		u1.setUname("Mathew123");
		u1.setAddress("Delhi, India");
		u1.compare(l1);
		u1.compare(l2);
		u1.compare(l3);
	}
}