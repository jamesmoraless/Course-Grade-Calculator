package Q2;

/**
 * Programming Question on Course Grades
 * The GradedActivity class holds a grade
 * for a graded activity
 */

public class GradeActivity
{
    private double score;  // Numeric score
    /**
     * The constructor without argument
     */
    public GradeActivity(){}

    /**
     * The constructor with argument
     */
    public GradeActivity(double score){
        this.score = score;
    }

    /**
     * The setScore method stores its argument in
     * the score field.
     */

    public void setScore(double score)
    {
        this.score = score;
    }

    /**
     * The getScore method returns the score field.
     */

    public double getScore()
    {
        return score;
    }

    /**
     * The getGrade method returns a letter grade
     * determined from the score field after receiving the score from outside.
     */

    public char getGrade(double scr)
    {
        char letterGrade;  // To hold the grade

        if (scr >= 90)
            letterGrade = 'A';
        else if (scr >= 80)
            letterGrade = 'B';
        else if (scr >= 70)
            letterGrade = 'C';
        else if (scr >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}

