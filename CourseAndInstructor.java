package Q2;

public class CourseAndInstructor extends InstructorInfo
{
    private String courseName;

    public CourseAndInstructor()
    {
        super();
    }

    public CourseAndInstructor (String cN, String fN, String lN, String oL)
    {
        super(fN,lN,oL);//Here I am accessing the methods in the parent classes (Name and InstructorInfo)
        courseName = cN;
    }

    public String toString()
    {
        return ("\nCourse name: " + courseName + super.toString());//Here I print out the course name along with the instructor's information such as first and last name and office location
    }


}
