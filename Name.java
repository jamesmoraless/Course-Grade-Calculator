package Q2;

public class Name
{
    private String firstName;
    private String lastName;


    public Name() {}

    public Name (String fN, String lN)
    {
        firstName = fN;
        lastName = lN;

    }

    public String toString()
    {
        return ("\n" + "Name: " + firstName + " " + lastName);//prints out a first and last name

    }


}
