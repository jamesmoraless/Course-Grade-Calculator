package Q2;

public class CourseGrades implements Analyzable {

    private GradeActivity [] grades;//Here I create a Grade activity type array named grades

    public CourseGrades(GradeActivity[] grades)
    {
        this.grades = grades;
    }

    public GradeActivity getExpectedScore()//Here I calculate the sum of each element inside my grades array. (each element will be my grading components)
    {
        double sum = 0;

        for (int i = 0; i < grades.length; i++)
        {
            sum += grades[i].getScore();//sums up all my grading components found in my grades array
        }
        GradeActivity moi = new GradeActivity(sum);

        return moi;//Here I am returning a GradeActivity type object with the score equating to the sum of each grading component associated to it
    }

    public String toString()//Here I am formatting each grading component found in my grades array in order to match the required output
    {
        String output = String.format("==================================================================\n"+
                "Lab Score: %.2f out of 20, \t %.2f%% \t\t Grade: %c\n" +
                "Quiz Score: %.2f out of 20,\t %.2f%% \t\t Grade: %c\n" +
                "Reading Assessment Score: %.2f out of 5,\t %.2f%% \t\t Grade: %c\n" +
                "Midterm Score: %.2f out of 20,\t %.2f%% \t\t Grade: %c\n" +
                "Final Exam Score: %.2f out of 35,\t %.2f%% \t\t Grade: %c\n" +
                "==================================================================",
                grades[0].getScore(), (grades[0].getScore()/20)*100, grades[0].getGrade((grades[0].getScore()/20)*100),
                grades[1].getScore(), (grades[1].getScore()/20)*100, grades[1].getGrade((grades[1].getScore()/20)*100),
                grades[2].getScore(), (grades[2].getScore()/5)*100, grades[2].getGrade((grades[2].getScore()/5)*100),
                grades[3].getScore(), (grades[3].getScore()/20)*100, grades[3].getGrade((grades[3].getScore()/20)*100),
                grades[4].getScore(), (grades[4].getScore()/35)*100, grades[4].getGrade((grades[4].getScore()/35)*100));

        return output;
    }
}
