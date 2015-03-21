package collections;

public enum EnumItem{

	Prod1("h",12),Prod2("b",44),Prod3("a",1),Prod4("d",11);
	
	private String name;
	private int price;
	
	private EnumItem(String name, int price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
