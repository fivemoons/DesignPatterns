package No_01Singleton;

//懒汉模式 普通加锁解决线程安全问题
public class Singleton2 {
	//1、将构造方法私有化，不允许外边直接创建对象
	private Singleton2(){}
	
	//2、声明类的唯一实例，使用private static修饰
	private static Singleton2 instance;
	
	//3、提供一个用于获取实例的方法，使用public static修饰
	public static synchronized Singleton2 getInstance(){
		if(instance==null){
			instance = new Singleton2();
		}
		return instance;
	}
	
}
