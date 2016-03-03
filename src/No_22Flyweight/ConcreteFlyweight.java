package No_22Flyweight;

public class ConcreteFlyweight implements Flyweight{

	@Override
	public void action(int arg) {
		System.out.println("参数值" + arg);
	}
	
}
