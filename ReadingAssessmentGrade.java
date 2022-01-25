package Q2;

public class ReadingAssessmentGrade extends  GradeActivity
{
    private double [] raGrade;

    public ReadingAssessmentGrade(double [] readGr)
    {
        raGrade = new double[readGr.length];
        for (int i = 0; i < readGr.length; i++)
            raGrade[i] = readGr[i];
        // Set the scores to GradeActivity by finding the average of the reading assessment grades.
        //this following part could have been done with the array reference variable raGrade only
        double average = 0;
        for (int i = 0; i < raGrade.length; i++)
            average += raGrade[i];
        //Calculate 20%; Each reading assessment was graded out of 265
        average = (average / 265)*5;
        // Set the reading assessment average score out of 5% back to GradeActivity field 'score'.
        setScore(average);
    }
}
