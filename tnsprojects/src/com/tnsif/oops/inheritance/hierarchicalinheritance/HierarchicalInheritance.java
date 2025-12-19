package com.tnsif.oops.inheritance.hierarchicalinheritance;

public class HierarchicalInheritance {
	public class HierarchicalInhDemo {

		public static void main(String[] args) {
			Person p1 = new Person();
			System.out.println("----------------- Person Details ---------------------");
			System.out.println(p1);

			Person p;
			p = new Person("kalai", "Mumbai");
			if (p instanceof Person)
				System.out.println("Person Details "+p);
			
			p = new Employee("eashwar", "Mumbai", 101, 67000, "Sales");
			if (p instanceof Employee)
			System.out.println("Employee Details "+p);
			

			p = new Student("aakash", "Pune", "FE", 88);
			if (p instanceof Student)
				System.out.println("Student Details "+p);

		}

	}


}
