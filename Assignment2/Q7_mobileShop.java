 /*
  Create a Shop which sells only Mobiles.
   Now create a customer and visit the shop and purchase a VIVO mobile if it has Android 15 only.
 */
 

class Mobile {
	private String model;
	private int price;
	
	public String getModel(){
		return this.model;
	}
	public void setModel(String model){
		this.model = model;
	}

	public int getPrice(){
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
}


class Customer {
	private String name;
	private String email;
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
		
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	void checkModel(Mobile m){
		if (m.getModel().equals("Android 15")){
			System.out.println("Will buy");
		}
		else{
			System.out.println("Will not buy");
			
		}
	}
}

class Q7_mobileShop{
	
	public static void main(String[] args){
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		
		m1.setModel("Android 15");
		m2.setModel("Apple");
		
		m1.setPrice(60000);
		m2.setPrice(120000);
		
		Customer c = new Customer();
		c.setName("Rajiv");
		c.setName("Rajiv@gmail.com");
		c.checkModel(m1);
		c.checkModel(m2);
	
		
	}
}