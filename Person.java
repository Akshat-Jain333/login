package java8;

public class Person 
//implements Comparable<Person>
{
	private int id;
	private String name;
	private float salary;
	public Person(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public float getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);
	}
	
	
}
