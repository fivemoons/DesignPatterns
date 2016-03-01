package No_02Factory;
//工厂：实现工厂接口，生产产品
public class Factory implements IFactory{

	@Override
	public IProduct createProduct() {
		// TODO Auto-generated method stub
		return new Product();
	}
	
}
