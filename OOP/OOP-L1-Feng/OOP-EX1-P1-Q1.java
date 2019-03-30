public class Student {
    public String name;
    public int mark1;
    public int mark2;
    public double average;
    
    public Student(String n) {
        name = n;
        mark1 = 0;
        mark2 = 0;
        average = 0.0;
    }
    
    public void setMarks(int x, int y) {//Gives the marks values. These values are decided by x and y
        mark1 = x;// The first mark of the student is set to the value of x
        mark2 = y;// The second mark of the student is set to the value of y
    }
    
    public void calcAverage() {
        average = (mark1 + mark2) / 2;//Calculates the average of the two marks, casted to an int
    }
    
    public String message() {//Returns a message
        return name + "You got an " + average;//Returns a string , containing the name and average of the student
    }

    public static void main(String[] args) {
        Student jeff= new Student("Jeff");
        Student jim= new Student("Jim");
        Student frank= new Student("Frank");
        Student bob= new Student("Bob");
        Student billy= new Student("Billy");
    }
} // Student class