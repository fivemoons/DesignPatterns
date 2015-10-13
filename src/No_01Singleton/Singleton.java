package No_01Singleton;

import java.io.Serializable;

//饿汉模式
public class Singleton implements Serializable{
	//1、构造方法私有化，不允许外部直接创建对象
	private Singleton(){}
	
	//2、创建类的唯一实例，使用private static修饰
	private transient static Singleton instance = new Singleton();
	
	//3、提供一个用于获取实例的方法，使用public static修饰
	public static Singleton getInstance(){
		return instance;
	}
	private Object readResolve(){
		return instance;
	}
}
