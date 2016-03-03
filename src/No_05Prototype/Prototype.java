package No_05Prototype;

public class Prototype implements Cloneable{ //原型模式 实现了 Cloneable接口
	public Prototype clone(){
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
}
