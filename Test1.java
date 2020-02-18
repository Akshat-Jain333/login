package java8;

import java.util.function.Function;

public class Test1 {
	public static void main(String[] args) {
		Function<Integer, Integer> square=(p)->p*p;
		System.out.println(square.apply(10));
		
		Function<Integer, Integer> factorial=(p)->{
			int f=1;
			for (int i = 1; i <= p; i++) {
				f=f*i;
			}
			return f;
		};
		System.out.println(factorial.apply(5));
	}
}
