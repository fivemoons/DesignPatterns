package No_02Factory;

public class Client {

	public static void main(String[] args) {
		IFactory factory = new Factory(); //实例化工厂
		IProduct product = factory.createProduct(); //实例化产品
		product.productMethod(); //使用产品
	}

}
