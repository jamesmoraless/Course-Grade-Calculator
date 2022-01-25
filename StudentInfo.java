package Q2;

public class StudentInfo extends Name
{
    private int studentNumber;
    private CourseAndInstructor courseInfo;

    public StudentInfo()
    {
        super();
    }

    public StudentInfo(String fN, String lN, int sN, CourseAndInstructor cInfo)
    {
        super(fN,lN);//Here I call the method used in the parent class (Name)
        this.courseInfo = cInfo;
        this.studentNumber = sN;
    }

    public String toString()//This toString method integrates the parent's toString method (which would output the student's first and last name) with its own by adding a int type data field named studentNumber and course information
    {
        return ("\nStudent Info: "+ super.toString() + "\nStudent Number: " + studentNumber + courseInfo.toString());
    }
}
