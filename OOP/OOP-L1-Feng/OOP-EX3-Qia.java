/**
 *Person
 *-fname: String
 *-lname: String
 *-DOB: String
 *-height: double
 *-weight: double
 *--------------
 *+Person(first: String, last: String) ------ NEW
 *+Person(first: String, last: String, DOB: String) ------ NEW
 *+Person(first: String, last: String, dob: String, h: double, w: double)
 *+setName(first: String, last: String): void
 *+convertKgToLbs(kg: double): double ------ NEW
 *+setWeight(w: double): boolean
 *+convertMetersToInches(m: double): double ------ NEW
 *+setHeight(h: double): boolean
 *+getName(): String
 *+getDOB(): String
 *+getDOB(type: String): int ------NEW
 *+getDOB_year(): int
 *+getDOB_month(): int
 *+getDOB_day(): int
 *+getHeight(): double
 *+getWeight(): double
 */

public class Person{
	private String fname;
	private String lname;
	private String DOB;
	private double height;
	private double weight;

	//NEW
	public Person(String first, String last){
		fname = first;
		lname = last;
		DOB = "mm/dd/yyyy";
		height = 0;
		weight = 0;
	}

	//NEW
	public Person(String first, String last, String DOB){
		fname = first;
		lname = last;
		this.DOB = DOB;
		height = 0;
		weight = 0;
	}

	public Person(String first, String last, String dob, double h, double w){
		fname = first;
		lname = last;
		DOB = dob;
		height = h;
		weight = w;
	}

	public void setName(String first, String last){
		fname = first;
		lname = last;
	}

	//NEW
	public static double convertKgToLbs(double kg){
		return kg*2.205;
	}

	public boolean setWeight(double w){
		weight = w;
		return true;
	}

	//NEW
	public static double convertMetersToInches(double m){
		return m * 39.37;
	}

	public boolean setHeight(double h){
		height = h;
		return true;
	}

	public String getName(){
		return fname + " " + lname;
	}

	public String getDOB(){
		return DOB;
	}

	//NEW
	public int getDOB(String type){
		if(type.equals("year"))
			return Integer.parseInt(DOB.substring(6));
		if(type.equals("month"))
			return Integer.parseInt(DOB.substring(0, 2));
		if(type.equals("day"))
			return Integer.parseInt(DOB.substring(3, 5));
	}

	public int getDOB_year(){
		return Integer.parseInt(DOB.substring(6));
	}

	public int getDOB_month(){
		return Integer.parseInt(DOB.substring(0, 2));
	}

	public int getDOB_day(){
		return Integer.parseInt(DOB.substring(3, 5));
	}

	public double getHeight(){
		return height;
	}

	public double getWeight(){
		return weight;
	}
}