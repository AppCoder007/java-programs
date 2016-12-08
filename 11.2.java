
public class testPerson {

	public static void main(String[] args) {

		Person main = new Person();
		Student details = new Student();
		Employee name =new Employee();
		Faculty office = new Faculty();
		Staff hours = new Staff();
		System.out.println(main.toString());
		System.out.println(details.toString());
		System.out.println(name.toString());
		System.out.println(office.toString());
		System.out.println(hours.toString());
	}

}

___________________________________________________________________________________________________


public class Person {
String name = "Dona";
String Address;
int phoneNumber;
String Email;
@Override
public String toString() {
	return "Person [name=" + name + "]";
}


}
______________________________________________________________________________________________________________


public class Student extends Person {
String FRESHMAN,SOPHOMORE,JUNIOR,SENIOR;

@Override
public String toString() {
	return "Student [name=" + name + "]";
}

}
_______________________________________________________________________________________________________


public class Employee extends Person {
String office;
int Salary;
String DateHired;
@Override
public String toString() {
	return "Employee [name=" + name + "]";
}

}
________________________________________________________________________________________________________________________________


public class Faculty extends Employee{
String office;
double hours;
int rank;
@Override
public String toString() {
	return "Faculty [name=" + name + "]";
}

}
______________________________________________________________________________________________________________________________________________


public class Staff extends Employee{
String title;

@Override
public String toString() {
	return "Staff [name=" + name + "]";
}

}
________________________________________________________________________________________________________________________________________________________________________

OUTPUT:

Person [name=Dona]
Student [name=Dona]
Employee [name=Dona]
Faculty [name=Dona]
Staff [name=Dona]


