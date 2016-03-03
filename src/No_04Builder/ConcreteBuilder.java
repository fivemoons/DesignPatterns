package No_04Builder;

public class ConcreteBuilder extends Builder{

	private Product product = new Product(); //每一个ConcreteBuilder都会生成一个product
	
	@Override
	public void setPart(String arg1, String arg2) {		
		product.setName(arg1);
		product.setType(arg2);
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
