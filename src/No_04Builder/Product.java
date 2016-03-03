package No_04Builder;

public class Product {//这是一个典型的javabean
	private String name;
	private String type;
	public void showProduct(){
		System.out.println("名称：" + name);
		System.out.println("类型：" + type);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setType(String type){
		this.type = type;
	}
}
