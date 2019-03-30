/**
 *Course
 *-code: String
 *-name: String
 *-level: String
 *-mark: float
 *-status: String
 *-lates: byte
 *-absences: byte
 *+maxLates: byte ------ NEW
 *+maxAbsences: byte ------ NEW
 *--------------
 *+Course(code: String, name: String, level: String) ------ Edited
 *+Course(code: String, name: String, level: String, mark: String, status: String) ------ NEW
 *+Course(code: String, name: String, level: String, mark: String, status: String, lates: byte, absences: byte) ------ NEW
 *+convertPercentToGrade(p: double): String ------ NEW
 *+convertGradeToPercent(g: String): double ------ NEW
 *+getMarkG(): String
 *+getMark(): float
 *+getStatus(): String
 *+getLevel(): String
 *+getCode(): String
 *+getName(): String
 *+getLates(): byte
 *+getAbsences(): byte
 *+addLates(): void ------NEW
 *+addLates(num: byte): void
 *+addAbsences(): void ------NEW
 *+addAbsences(num: byte): void
 *+setMark(m: float): boolean
 *+setStatus(stat: String): boolean
 *+toString(): String ------ NEW
 */


public class Course
{
    private String code;
    private String name;
    private String level;
    private float mark;
    private String status;
    private byte lates;
    private byte absences;
    public static byte maxLates = 50;
    public static byte maxAbsences = 50;

    public Course (String code, String name, String level)
    {
        this.code = code;
        this.name = name;
        this.level = level;
        mark = 0;
        status = "enrolled";
        lates = 0;
        absences = 0;
    }

    public Course (String code, String name, String level, String mark, float mark, String status)
    {
        this.code = code;
        this.name = name;
        this.level = level;
        this.mark = mark;
        this.status = status;
        lates = 0;
        absences = 0;
    }

    public Course (String code, String name, String level, String mark, float mark, String status, byte lates, byte absences)
    {
        this.code = code;
        this.name = name;
        this.level = level;
        this.mark = mark;
        this.status = status;
        this.lates = lates;
        this.absences = absences;
    }

    public static String convertPercentToGrade(double p){
        if (p >= 90)
            return "A+";
        else if (p >= 85)
            return "A";
        else if (p >= 80)
            return "A-";
        else if (p >= 77)
            return "B+";
        else if (p >= 73)
            return "B";
        else if (p >= 70)
            return "B-";
        else if (p >= 67)
            return "C+";
        else if (p >= 63)
            return "C";
        else if (p >= 60)
            return "C-";
        else if (p >= 57)
            return "D+";
        else if (p >= 53)
            return "D";
        else if (p >= 50)
            return "D-";
        else
            return "F";        
    }

    public static double convertGradeToPercent(String g){
        if (g.equals("A+"))
            return 90;
        else if (g.equals("A"))
            return 85;
        else if (g.equals("A-"))
            return 80;
        else if (g.equals("B+"))
            return 77;
        else if (g.equals("B"))
            return 73;
        else if (g.equals("B-"))
            return 70;
        else if (g.equals("C+"))
            return 67;
        else if (g.equals("C"))
            return 63;
        else if (g.equals("C-"))
            return 60;
        else if (g.equals("D+"))
            return 57;
        else if (g.equals("D"))
            return 53;
        else if (g.equals("D-"))
            return 50;
        else
            return 0;        
    }

    public String getMarkG ()
    {
        if (mark >= 90)
            return "A+";
        else if (mark >= 85)
            return "A";
        else if (mark >= 80)
            return "A-";
        else if (mark >= 77)
            return "B+";
        else if (mark >= 73)
            return "B";
        else if (mark >= 70)
            return "B-";
        else if (mark >= 67)
            return "C+";
        else if (mark >= 63)
            return "C";
        else if (mark >= 60)
            return "C-";
        else if (mark >= 57)
            return "D+";
        else if (mark >= 53)
            return "D";
        else if (mark >= 50)
            return "D-";
        else
            return "F";

    }

    public float getMark ()
    {
        return mark;
    }

    public String getStatus ()
    {
        return status;
    }

    public String getLevel ()
    {
        return level;
    }

    public String getCode ()
    {
        return code;
    }

    public String getName ()
    {
        return name;
    }

    public byte getLates ()
    {
        return lates;
    }

    public byte getAbsences ()
    {
        return absences;
    }

    public void addLates ()
    {
        lates ++;
        if(lates>maxLates)
            System.out.println("Max lates exceeded");
    }

    public void addLates (byte num)
    {
        lates += num;
        if(lates>maxLates)
            System.out.println("Max lates exceeded");
    }

    public void addAbsences ()
    {
        absences ++;
        if(absences>maxAbsences)
            System.out.println("Max absences exceeded");
    }

    public void addAbsences (byte num)
    {
        absences += num;
        if(absences>maxAbsences)
            System.out.println("Max absences exceeded");
    }

    public boolean setMark (float m)
    {
        mark = m;
        if (mark >= 0 && mark <= 100)
            return true;
        return false;
    }

    public boolean setStatus (String stat)
    {
        if(stat.equals("completed") || stat.equals("enrolled") || stat.equals("failed"))
            status = stat;
    }

    public String toString(){
        System.out.println("This is the " + name + " course of the code" + code + " at the " + level + " level. The current status is" + status);
    }
}