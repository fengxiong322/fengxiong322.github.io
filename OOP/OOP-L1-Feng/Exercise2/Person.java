/**
 *Person
 *-fname: String
 *-lname: String
 *-DOB: String
 *-height: double
 *-weight: double
 *--------------
 *+Person(first: String, last: String, dob: String, h: double, w: double)
 *+setName(first: String, last: String): void
 *+setWeight(w: double): boolean
 *+setHeight(h: double): boolean
 *+getName(): String
 *+getDOB(): String
 *+getDOB_year(): int
 *+getDOB_month(): int
 *+getDOB_day(): int
 *+getHeight(): double
 *+getWeight(): double
 */

/**
 * @author Feng Xiong
 *
 */
public class Person{
	private String fname;
	private String lname;
	private String DOB;
	private double height;
	private double weight;
	/**
	 * @param first first name of the person
	 * @param last last name of the person
	 * @param dob date of birth
	 * @param h height
	 * @param w weight
	 */
	public Person(String first, String last, String dob, double h, double w){
		fname = first;
		lname = last;
		DOB = dob;
		height = h;
		weight = w;
	}

	/**
	 * @param first new first name
	 * @param last new last name
	 */
	public void setName(String first, String last){
		fname = first;
		lname = last;
	}

	/**
	 * @param w the new weight of the person
	 * @return if the assignment was successful
	 */
	public boolean setWeight(double w){
		weight = w;
		return true;
	}

	/**
	 * @param h the new height of the person
	 * @return if the assignment was successful
	 */
	public boolean setHeight(double h){
		height = h;
		return true;
	}

	/**
	 * @return the full name of the person
	 */
	public String getName(){
		return fname + " " + lname;
	}

	/**
	 * @return the full birth date of the person
	 */
	public String getDOB(){
		return DOB;
	}

	/**
	 * @return the year of birth
	 */
	public int getDOB_year(){
		return Integer.parseInt(DOB.substring(6));
	}

	/**
	 * @return the month of birth
	 */
	public int getDOB_month(){
		return Integer.parseInt(DOB.substring(0, 2));
	}

	/**
	 * @return the day of birth
	 */
	public int getDOB_day(){
		return Integer.parseInt(DOB.substring(3, 5));
	}

	/**
	 * @return the current height of the person
	 */
	public double getHeight(){
		return height;
	}

	/**
	 * @return the current weight of the person
	 */
	public double getWeight(){
		return weight;
	}
}