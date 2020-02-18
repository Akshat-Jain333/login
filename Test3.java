package java8;

import java.util.function.Function;

public class Test3 {
	public static void main(String[] args) {
		Function<Integer, Integer> square=p->p*p;
		Function<Integer, Integer> addone=p->p+1;
		
		Function<Integer, Integer> square_addone= square.andThen(addone);
		int res=square_addone.apply(6);
		System.out.println(res);
		Function<Integer, Integer> comp1=square.compose(square_addone);
		System.out.println(comp1.apply(4));
	}
}
