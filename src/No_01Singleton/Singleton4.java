package No_01Singleton;

//懒汉模式，使用内部类来实现lazy加载，并且能保证线程安全
public class Singleton4 {
	private Singleton4(){}
	
	private static class SingletonHolder{
		private final static Singleton4 INSTANCE = new Singleton4();
	}
	
	public static Singleton4 getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
