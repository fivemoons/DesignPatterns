package No_06TemplateMethod;

public abstract class AbstractSort { //抽象排序方法
	protected abstract void sort(int[] array);
	public void showSortResult(int[] array){
		this.sort(array);
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]+"_");
		}
	}
}
