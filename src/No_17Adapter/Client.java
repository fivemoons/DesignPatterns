package No_17Adapter;

public class Client {
	public static void main(String[] args) {
		Adapter adapter = new concreteAdapter(new Adaptee()); //用USB转Type-C
		adapter.adapteeMethod(); //USB
		adapter.adapterMethod(); //Type
	}
}
