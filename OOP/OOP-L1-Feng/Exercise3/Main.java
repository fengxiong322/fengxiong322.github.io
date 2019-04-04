public class Main{

	public static void main(String[] args) {
		Person feng = new Person("Feng", "Xiong");
		Person me = new Person("me", "you", "11/11/1111");
		Person.convertKgToLbs(12.1);
		Person.convertMetersToInches(123.1);

		Course science = new Course("ICS4U0", "Computer Science", "Grade 12 AP", "enrolled");
		Course computerScience = new Course("ICS4U0", "Computer Science", "Grade 12 AP", "enrolled", 0, 0);
	}
}