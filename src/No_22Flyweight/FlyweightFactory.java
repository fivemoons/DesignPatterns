package No_22Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, Flyweight> flyweights = new HashMap<>();
	
	public FlyweightFactory(String arg){
		flyweights.put(arg, new ConcreteFlyweight());
	}
	
	public static Flyweight getFlyweight(String key){
		if(flyweights.get(key) == null){
			flyweights.put(key, new ConcreteFlyweight());
		}
		return flyweights.get(key);
	}
	
	public static int getSize(){
		return flyweights.size();
	}
}
