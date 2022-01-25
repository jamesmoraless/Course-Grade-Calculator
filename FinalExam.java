package Q2;


import Q2.GradeActivity;

/**
 * Programming Question on Course Grades
 * The FinalExam class stores information
 * about a graded activity in the final exam after inheriting all from GradedActivity Class.
 */

public class FinalExam extends GradeActivity {
    private int mcq;  // Number of MCQs 1 point each
    private int longQuestions;  // Number of long questions
    private double longQPointEach; // Points for each Long question
    private int numMCQsMissed;     // Number of MCQs missed
    private double expectedPercentLongQ; //expected Percent of mark in Long Q
    private double finalExamScore; //holds final exam score

    /**
     * The constructor accepts as arguments all the field values except finalExamScore
     */

    public FinalExam(int mcq, int longQuestions, double longQPointEach, int numMCQsMissed, double expectedPercentLongQ) {
        // Set the numQuestions and numMissed fields.
        this.mcq = mcq;
        this.longQuestions = longQuestions;
        this.longQPointEach = longQPointEach;
        this.numMCQsMissed = numMCQsMissed;
        this.expectedPercentLongQ = expectedPercentLongQ;
        //Total available mark
        double longQWeight = longQuestions * longQPointEach;
        double totalWeight = mcq + longQWeight;
        // Calculate the final exam score out of 100%
        finalExamScore = totalWeight - (numMCQsMissed + (longQWeight*(100-expectedPercentLongQ)/100));
        // Call the superclass's setScore method to set the final-exam score out of 35%.
        setScore(finalExamScore*.35);
    }
}