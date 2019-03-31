/**
 *Course
 *-code: String
 *-name: String
 *-level: String
 *-mark: float
 *-status: String
 *-lates: byte
 *-absences: byte
 *--------------
 *+Course(c: String, n: String, lev: String)
 *+getMarkG(): String
 *+getMark(): float
 *+getStatus(): String
 *+getLevel(): String
 *+getCode(): String
 *+getName(): String
 *+getLates(): byte
 *+getAbsences(): byte
 *+addLates(num: byte): void
 *+addAbsences(num: byte): void
 *+setMark(m: float): boolean
 *+setStatus(stat: String): boolean
 */

/**
 * @author Feng Xiong
 *
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

    /**
     * @param c Represents the code of the course
     * @param n Represents the name of the course
     * @param lev Represents the grade level of the course
     */
    public Course (String c, String n, String lev)
    {
        code = c;
        name = n;
        level = lev;
        mark = 0;
        status = "enrolled";
        lates = 0;
        absences = 0;
    }


    /**
     * @return The mark in letter form(eg. A+, A, A-)
     */
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


    /**
     * @return the mark in percentage form
     */
    public float getMark ()
    {
        return mark;
    }


    /**
     * @return currrent status of the course
     */
    public String getStatus ()
    {
        return status;
    }


    /**
     * @return current level of the course
     */
    public String getLevel ()
    {
        return level;
    }


    /**
     * @return current code of the course
     */
    public String getCode ()
    {
        return code;
    }


    /**
     * @return current name of the course
     */
    public String getName ()
    {
        return name;
    }


    /**
     * @return the number of lates
     */
    public byte getLates ()
    {
        return lates;
    }


    /**
     * @return the number of absences
     */
    public byte getAbsences ()
    {
        return absences;
    }


    /**
     * @param num number of new lates
     */
    public void addLates (byte num)
    {
        lates += num;
    }


    /**
     * @param num number of new absences
     */
    public void addAbsences (byte num)
    {
        absences += num;
    }


    /**
     * @param m value of the new mark
     * @return success of the assignment of the mark
     */
    public boolean setMark (float m)
    {
        mark = m;
        if (mark >= 0 && mark <= 100)
            return true;
        return false;
    }

    /**
     * @param stat value of the new status
     * @return success of the assignment of the status
     */
    public boolean setStatus (String stat)
    {
        if(stat.equals("completed") || stat.equals("enrolled") || stat.equals("failed"))
            status = stat;
    }
}