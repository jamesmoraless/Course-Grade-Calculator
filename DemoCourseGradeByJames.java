package Q2;

import Q1.MyMethod;
/**********************************************************************************************************
 James Morales
 251136192
 April 9th 2021
 Q2 focuses on using the super keyword along with arrays and polymorphism in order to output a student's current and predicted grades.
 ************************************************************************************************************/
public class DemoCourseGradeByJames
{
    public static void main(String[] args) {
        MyMethod.printHeader("James Morales", "none", "none", 9, 2);//Recycled header

        CourseAndInstructor courseAndProf = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB361");//Instantiated a courseAndInstructor object with given values

        StudentInfo student = new StudentInfo("James", "Morales", 251136192, courseAndProf);//Instantiated a student type object with given values

        System.out.println(student.toString());//Here I am printing the "student" object with proper formatting

        double [] labG = new double [] {30,30,28,30,28,30,30,30,30};//Here are my lab grades in an array named labG

        double [] quizG = new double [] {10,9,7.5,10,8.7,7};//Here are my best quiz grades in an array names quizG

        double [] readG = new double [] {30,24,15,23,21,22,23,25,20,26,35};//Here are my reading assignment grades in an array named readG

        double midtermG = 36;//Here is my midterm mark stored in a double type data-field

        LabGrade labComponent = new LabGrade(labG);//Here is a LabGrade object being instantiated with the labG array as an argument

        QuizGrade quizComponent = new QuizGrade(quizG);//Here is a QuizGrade object being instantiated with the quizG array as an argument

        ReadingAssessmentGrade readingComponent = new ReadingAssessmentGrade(readG);//Here is a readingGrade object being instantiated with the readG array as an argument

        GradeActivity mids = new GradeActivity(midtermG/37*20);//Here I instantiate a GradeActivity object with the midterm mark out of 20 as an argument

        FinalExam finals = new FinalExam(50,2,25,10,100);//Here I instantiate a FinalExam object with requested arguments filled out correctly

        GradeActivity [] gA = new GradeActivity[5];//Here I make a GradeActivity type array to store all the grading components

        //Here I am making it so that at every position in the gA array stored a GradeActivity object
        for (int i = 0; i < gA.length; i++)
        {
            gA[i] = new GradeActivity();
        }

        //Grading components are stored manually
        gA[0] = labComponent;
        gA[1] = quizComponent;
        gA[2] = readingComponent;
        gA[3] = mids;
        gA[4] = finals;

        CourseGrades myCourse = new CourseGrades(gA);//Here I Instantiate a courseGrade object with the array containing all the grading components as an argument

        System.out.println(myCourse.toString());//Here I am printing my ensemble of grading components with the proper format


        System.out.printf("Expected course score: %.2f Grade: %c\n", myCourse.getExpectedScore().getScore(),myCourse.getExpectedScore().getGrade(myCourse.getExpectedScore().getScore()) );//Here I print out the predicted score and predicted grade by using dot products related to my ensemble of grading components (myCourse)


        MyMethod.printFooter("I did it. Goodbye from James Morales.");//Recycled footer

    }
}
