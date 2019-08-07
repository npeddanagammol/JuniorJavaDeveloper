package classes.objects;


class Person{
	int age;
	String gender;
	String name;
	String email;
	int phone;
	
	public void routine() {
		System.out.println(
				
				name +" wake up by 4 and get ready live the best. "
				);
		workout();
		pooja();
		planning();
		family();
		office();
		
	}
	
	
	public void details() {
		Email();
		age();
		
	}
	
	public void workout() {
		System.out.println(name +" is doing yoga ");
	}
	
	public void pooja() {
		System.out.println(" Time to perform pooja ");
	}
	
	public void planning() {
		if(gender == "male") {
		System.out.println(name + "always plan his day");
	}else System.out.println(name + "always plan her day");
	}
	
	
	public void skillsUpdation() {
		System.out.println(name+" Dialy upgrade his skills and revise his base skills ");
	}
	
	public void family() {
		System.out.println(name + " Never miss to speak his family atleast few minutes before going to office ");
	}
	public void office() {
		System.out.println(name +" Going to office");
	}
	
	public void Email() {
		System.out.println(name + "'s email Id: "+ email);
	}
	
	public void age() {
		System.out.println(name + "'s age: "+age);
		
	}
}


public class ClassesAndObjects {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.name = "narendra";
		person.age = 33;
		person.email="narensedam@gmail.com";
		person.gender="male";
		
		
		person.details();
		System.out.println("~~~~~~~~~~~~~~~~~");
		person.routine();
		

	}

}
