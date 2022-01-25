package Q2;

public class QuizGrade extends GradeActivity
{
    private double [] quizGrades;

    public QuizGrade(double [] quizGr)
    {
        quizGrades = new double[quizGr.length];
        for (int i = 0; i < quizGr.length; i++)
            quizGrades[i] = quizGr[i];
        // Set the scores to GradeActivity by finding the average of the quiz grades.
        double average = 0;
        for (int i = 0; i < quizGrades.length; i++)
            average += quizGrades[i];
        //Calculate 20%; Each lab was graded out of 10
        average = (average / quizGrades.length/1)*2;
        // Set the lab average score out of 20% back to GradeActivity field 'score'.
        setScore(average);
    }
}
