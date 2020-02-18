package java8;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {
	public static void main(String[] args) {
		int id1[]= {1009, 1002, 1004, 1001};
		String name[]= {"Akshat", "Ashu", "Raj", "Simran"};
		float salary[]= {2000, 1500, 1200, 1000};
		Person person[]=new Person[4];
		for (int i = 0; i < person.length; i++) {
			person[i]=new Person(id1[i], name[i], salary[i]);
		}
		
		/*Comparator<Person> sortByName = new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};*/
		
		Comparator<Person> sortByName=(o1,o2)->		//USING LAMBDA NOTATION
		o1.getName().compareTo(o2.getName());
		
		Comparator<Person> sortBysalary=(o1,o2)->		//USING LAMBDA NOTATION
		new Float( o1.getSalary()).compareTo(new Float(o2.getSalary()));
		
		Arrays.sort(person, sortByName);
		for (Person person2 : person) {
			System.out.println(person2);
		}
		
		Arrays.sort(person, sortBysalary);
		for (Person person2 : person) {
			System.out.println(person2);
		}
	}
}
