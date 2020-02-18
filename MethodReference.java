package java8;

import java.util.function.ToIntFunction;

public class MethodReference {
	public static void main(String[] args) {
		String s="Learning JAVA";
		ToIntFunction<String> function=p->p.length();
		int length=function.applyAsInt(s);
		System.out.println(length);
		
		ToIntFunction<String> function1=String::length;
		System.out.println(function1.applyAsInt(s));
	}

}
