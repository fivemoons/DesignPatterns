package No_12Strategy;

public class Client {
	public static void main(String[] args) {
		new Context(new ConcreteStrategy1()).execute();
		new Context(new ConcreteStrategy2()).execute();
	}
}
