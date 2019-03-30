public class Main {

	public static void main(String[]args){
		//ALL FIRST OBJECTS
		//UML A
		Person person = new Person("Bob", "Jackson", "01/01/2003", 67.2, 123.3);
		person.setName("Jack", "Smith");//Bob Jackson went to get his name changed because he didn't like it
		person.setWeight(130.2);//He has grown, so we need to update our database
		person.setHeight(71.3);//His height also changed as he grew
		System.out.println("Hello, my name is " + person.getName());//Someone came by and asked for his name. He truthfully responded
		System.out.println(person.getDOB());//He decided to sign up on a website, and enters his birth date
		System.out.println(person.getDOB_year());//The website asks to confirm the year. He responds
		System.out.println(person.getDOB_month());//The website asks to confirm the month. He responds
		System.out.println(person.getDOB_day());//The website asks to confirm the day. He responds

		//UML B
		Wheel wheel = new Wheel("Goodyear", "Assurance", 185, "all-season");//Tire size is "185/65R14"
		wheel.update_KM_usage(10);//The car was driven 10 kilometres today
		System.out.println("This wheel is from " + wheel.getBrand());// Someone thought this was a nice tire, and asked for the brand. The owner answered
		System.out.println("This wheel is a " + wheel.getModel());// Someone thought this was a nice tire, and asked for the model. The owner answered
		System.out.println("This wheel has a size of " + wheel.getSize());// Someone thought this was a nice tire, and asked for the size of the tire. The owner answered
		System.out.println("This wheel is for " + wheel.getSeason());// Someone thought this was a nice tire, and asked for the season this tire is used for. The owner answered
		System.out.println("This wheel has been used for " + wheel.getKM());// The owner checked the guage and told himself the number of km he has driven that wheel

		//UML C
		Course computerScience = new Course("ICS4U0", "Computer Science", "Grade 12 AP");
		System.out.println(computerScience.getMarkG());//A student wanted to know his grade mark in the course. He checks a conversion website
		System.out.println(computerScience.getMark());//A student wanted to know his percentage mark and checks his report card
		System.out.println(computerScience.getStatus());//The guidance counsellor checks the current status of the student in the course, and tells the student he can transfer. The student decides not to transfer
		System.out.println(computerScience.getLevel());//The student wants to know who this course is for, and checks the level on his timetable
		System.out.println(computerScience.getCode());//A student wants to know the course code to fill in his course selection for next year
		System.out.println(computerScience.getName());//A student wanted to know the name of the course so he can brag to his friends
		System.out.println(computerScience.getLates());//The teacher wants to remember how many times the student has been late. They check the school system
		System.out.println(computerScience.getAbsences());//The teacher wants to remember how many times the student has been absent. They check the school system
		computerScience.addLates(2);//The student was late for class twice
		computerScience.addAbsences(2);//The student was sick and couldnt come to class for 2 days
		computerScience.setMark(75);//The teacher fills in the mark for the student in the system

		//UML D
		Vehicle car = new Vehicle("car", "Honda", "Civic", 2017, "white", 5, 8.2);
		car.paint("yellow");//The owner got the car a new paint job
		car.gasUp(7.2);//The owner got his car filled up so he can drive
		System.out.println(car.drive(2));//The car has a function to show if you can reach your destination
		System.out.println("I got a new " + car.getType() + "!");//The owner bragged about getting a new car
		System.out.println("This is my new " + car.getManufact()+ " " +car.getModel()+ " of the year " + car.getYear() + "!");//Owner continues to brag...
		System.out.println("I gave it a paint job and now its " + car.getColour() + "! It also has " + car.getDoors() + " doors and a massive " + car.getTankSize() + "litre tank!");//Even more bragging...

		//UML E
		Account me = new Account("19282437", "savings", 12.20);
		System.out.println("Hello " + me.getAccount() ". This is a " + me.getType() + " account");//Yep thats me!
		System.out.println("Your balance is $"+me.getBalance());//wow!
		me.calcInterest();//I wonder how much free money I got this month!
		System.out.println("Your balance is $"+me.getBalance());//Free money!
		System.out.println("You have withdrawed $" + me.withdraw(2.20));//HAHA Im going to use my free money
		System.out.println("You have deposited $" + me.deposit(2.20));//Nevermind, I want more free money!
		me.setInterestRate(10.0);//Now I get even more free money


		//ALL SECOND OBJECTS
				//UML A
		Person anotherperson = new Person("Bob", "Jackson", "01/01/2003", 67.2, 123.3);
		anotherperson.setName("Jack", "Smith");//Bob Jackson went to get his name changed because he didn't like it
		anotherperson.setWeight(130.2);//He has grown, so we need to update our database
		anotherperson.setHeight(71.3);//His height also changed as he grew
		System.out.println("Hello, my name is " + anotherperson.getName());//Someone came by and asked for his name. He truthfully responded
		System.out.println(anotherperson.getDOB());//He decided to sign up on a website, and enters his birth date
		System.out.println(anotherperson.getDOB_year());//The website asks to confirm the year. He responds
		System.out.println(anotherperson.getDOB_month());//The website asks to confirm the month. He responds
		System.out.println(anotherperson.getDOB_day());//The website asks to confirm the day. He responds

		//UML B
		Wheel wheel2 = new Wheel("Goodyear", "Assurance", 185, "all-season");//Tire size is "185/65R14"
		wheel2.update_KM_usage(10);//The car was driven 10 kilometres today
		System.out.println("This wheel is from " + wheel2.getBrand());// Someone thought this was a nice tire, and asked for the brand. The owner answered
		System.out.println("This wheel is a " + wheel2.getModel());// Someone thought this was a nice tire, and asked for the model. The owner answered
		System.out.println("This wheel has a size of " + wheel2.getSize());// Someone thought this was a nice tire, and asked for the size of the tire. The owner answered
		System.out.println("This wheel is for " + wheel2.getSeason());// Someone thought this was a nice tire, and asked for the season this tire is used for. The owner answered
		System.out.println("This wheel has been used for " + wheel2.getKM());// The owner checked the guage and told himself the number of km he has driven that wheel

		//UML C
		Course computerScience2 = new Course("ICS4U0", "Computer Science", "Grade 12 AP");
		System.out.println(computerScience2.getMarkG());//A student wanted to know his grade mark in the course. He checks a conversion website
		System.out.println(computerScience2.getMark());//A student wanted to know his percentage mark and checks his report card
		System.out.println(computerScience2.getStatus());//The guidance counsellor checks the current status of the student in the course, and tells the student he can transfer. The student decides not to transfer
		System.out.println(computerScience2.getLevel());//The student wants to know who this course is for, and checks the level on his timetable
		System.out.println(computerScience2.getCode());//A student wants to know the course code to fill in his course selection for next year
		System.out.println(computerScience2.getName());//A student wanted to know the name of the course so he can brag to his friends
		System.out.println(computerScience2.getLates());//The teacher wants to remember how many times the student has been late. They check the school system
		System.out.println(computerScience2.getAbsences());//The teacher wants to remember how many times the student has been absent. They check the school system
		computerScience2.addLates(2);//The student was late for class twice
		computerScience2.addAbsences(2);//The student was sick and couldnt come to class for 2 days
		computerScience2.setMark(75);//The teacher fills in the mark for the student in the system

		//UML D
		Vehicle car2 = new Vehicle("car", "Honda", "Civic", 2017, "white", 5, 8.2);
		car2.paint("yellow");//The owner got the car a new paint job
		car2.gasUp(7.2);//The owner got his car filled up so he can drive
		System.out.println(car2.drive(2));//The car has a function to show if you can reach your destination
		System.out.println("I got a new " + car2.getType() + "!");//The owner bragged about getting a new car
		System.out.println("This is my new " + car2.getManufact()+ " " +car2.getModel()+ " of the year " + car2.getYear() + "!");//Owner continues to brag...
		System.out.println("I gave it a paint job and now its " + car2.getColour() + "! It also has " + car2.getDoors() + " doors and a massive " + car2.getTankSize() + "litre tank!");//Even more bragging...

		//UML E
		Account you = new Account("19282437", "savings", 12.20);
		System.out.println("Hello " + you.getAccount() ". This is a " + you.getType() + " account");//Yep thats me!
		System.out.println("Your balance is $"+you.getBalance());//wow!
		you.calcInterest();//I wonder how much free money I got this month!
		System.out.println("Your balance is $"+you.getBalance());//Free money!
		System.out.println("You have withdrawed $" + you.withdraw(2.20));//HAHA Im going to use my free money
		System.out.println("You have deposited $" + you.deposit(2.20));//Nevermind, I want more free money!
		you.setInterestRate(10.0);//Now I get even more free money
	}

}