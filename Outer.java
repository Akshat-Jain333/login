package java8;

public class Outer {
	private float salary;
	private float pf;
	
	public Outer(float salary, float pf) {
		super();
		this.salary=salary;
		this.pf=pf;
	}
	
	private class Inner{
		float netSalary() {
			return salary-(salary*pf/100);
		}
	}
	public static void main(String[] args) {
		Outer outer= new Outer(20000,5);
		Outer.Inner inner=outer.new Inner();
		
		System.out.println("Salary is "+outer.salary);
		System.out.println("PF is "+outer.pf);
		System.out.println("Net Salary is "+inner.netSalary());
	}

}
