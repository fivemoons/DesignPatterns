package No_01Singleton;

//懒汉模式：这种模式下只在null的时候加锁，能够提高性能
public class Singleton3 {
	
	private Singleton3(){}
	//使用volatile关键字修饰 确保不会指令重排序
	private static volatile Singleton3 instance = null; 
	
	public static Singleton3 getInstance(){
		if(instance == null){
			synchronized (Singleton3.class) {
				if(instance == null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
