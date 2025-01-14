// compare objects

class  LED{
	private int id;
	private String brand;
	private int price;
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
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
}

class Q4_tvPriceComparison {
	public static void main(String[] args){
		LED oled1 = new LED();
		LED oled2 = new LED();
		
		oled1.setBrand("Sony");
		oled2.setBrand("Samsung");
		
		oled1.setId(12365);
		oled2.setId(89067);
		
		oled1.setPrice(5000);
		oled2.setPrice(5674);
		
		if (oled1.getPrice() > oled2.getPrice()) {
			oled1.setBrand("Premium Model");	
		}
		else {
			oled2.setBrand("Premium Model");	
			
		}
		
		System.out.println("The 2 models are "+oled1.getBrand()+" and "+oled2.getBrand());
	}
}