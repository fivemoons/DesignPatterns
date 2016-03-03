package No_04Builder;

public class Director {
	private Builder builder = new ConcreteBuilder();
	public Product getAProduct(){
		builder.setPart("宝马", "X7");
		return builder.getProduct();
	}
	public Product getBProduct(){
		builder.setPart("奥迪", "Q5");
		return builder.getProduct();
	}
}
