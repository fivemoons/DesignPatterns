package No_17Adapter;

public class concreteAdapter implements Adapter { //小米公司出的适配器

	private Adaptee adaptee; //内置一个USB类
	
	public concreteAdapter(Adaptee adaptee){ //构造函数 
		this.adaptee = adaptee;
	}

	public void adapteeMethod() { //USB的函数
		adaptee.adapteeMethod();
	}
	
	@Override
	public void adapterMethod() { //Type-C的函数
		System.out.println("Type-C充电");
	}
}
