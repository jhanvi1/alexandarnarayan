package scratch;

public class quiz2 {
	private int a;
	public double b;
	
	public quiz2(int first, double second){
		this.a = first;
		this.b = second;
	}
	
	public static void main(String[] args){
		quiz2 c1 = new quiz2(10,20.5);
		quiz2 c2 = new quiz2(10,31.5);
		
		c2 = c1;
		c1.a = 2;
		System.out.println(c2.a);
		
	}
}