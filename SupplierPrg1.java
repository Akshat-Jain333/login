package java8;

import java.util.function.Supplier;

public class SupplierPrg1 {
	public static void main(String[] args) {
		Supplier<Integer> supplier = "Hello world"::length;
		System.out.println(supplier.get());
		
		Supplier<String> supplier1 = "Hello world"::toUpperCase;
		System.out.println(supplier1.get());

	}

}
