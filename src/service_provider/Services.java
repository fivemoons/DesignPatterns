package service_provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
	private Services(){} //防止实例化
	
	
	private static final Map<String,Provider> providers =
			new ConcurrentHashMap<String,Provider>();
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	
	//提供者注册API
	public static void registerDefaultProvider(Provider p){
		registerProvider(DEFAULT_PROVIDER_NAME,p);
	}
	public static void registerProvider(String name, Provider p){
		providers.put(name, p);
	}
	
	//服务访问API
	public static Service newInstance(){
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	public static Service newInstance(String name){
		Provider p = providers.get(name);
		if(p == null)
			throw new IllegalArgumentException(
					"No provider registered with name:" + name);
		return p.newService();
	}
	
}
