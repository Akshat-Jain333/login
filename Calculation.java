package java8;
@FunctionalInterface		//ONLY FOR SINGLE INTERFACE
interface Addition{
	float add(float a, float b);
}

public class Calculation {
	public static void main(String[] args) {
		Addition add=(x,y)->{return x+y;};
		Addition add1=(x,y)->x+y;
		System.out.println("sum is "+add1.add(45.65f, 89.48f));
	}
}
