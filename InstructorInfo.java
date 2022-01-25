package Q2;

public class InstructorInfo extends Name
{
    private static String officeNumber;

    public InstructorInfo()
    {
        super();
    }


    public InstructorInfo(String fN, String lN, String oL)
    {
        super(fN, lN);//Here I call the method used in the parent class (Name)
        officeNumber = oL;
    }

    public String toString()//This toString method integrates the parent's toString method (which would output the professors first and last name) with its own by adding a String type data field named office number
    {
        return ("\nInstructor Info:" + super.toString() + "\nOffice Location: " + officeNumber);
    }
}
