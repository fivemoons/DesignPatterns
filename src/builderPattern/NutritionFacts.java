package builderPattern;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	public static class Builder{
		//必选参数
		private final int servingSize;
		private final int servings;
		//可选参数
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		public Builder(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		public Builder calories(int val){
			calories = val; return this;
		}
		public Builder fat(int val){
			fat = val; return this;
		}
		public Builder carbohydrate(int val){
			carbohydrate = val; return this;
		}
		public Builder sodium(int val){
			sodium = val; return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
			.calories(100).sodium(35).calories(27).build();
		System.out.println(cocaCola.servingSize);
		System.out.println(cocaCola.servings);
		System.out.println(cocaCola.calories);
		System.out.println(cocaCola.fat);
		System.out.println(cocaCola.sodium);
		System.out.println(cocaCola.carbohydrate);
	}
}
