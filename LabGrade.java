package Q2;


import Q2.GradeActivity;

/**
 * The LabGrade class stores lab average in the score field of the GradedAcivity Class
 * after extending the GradeActivity Class
 */

public class LabGrade extends GradeActivity {
    // The following field stores all the lab grades in an array
    private double[] labGrades;

    /**
     * The constructor with parameter will find the average of the lab-grades
     * and set the score back to GradeActivity field 'score'
     */
    public LabGrade(double[] labGr) {
        //the following part is not necessary for the current code
        //but it has been kept for future extension
        labGrades = new double[labGr.length];
        for (int i = 0; i < labGr.length; i++)
            labGrades[i] = labGr[i];
        // Set the scores to GradeActivity by finding the average of the lab grades.
        //this following part could have been done with the array reference variable labGr only
        double average = 0;
        for (int i = 0; i < labGrades.length; i++)
            average += labGrades[i];
        //Calculate 20%; Each lab was graded out of 30
        average = (average / labGrades.length/3)*2;
        // Set the lab average score out of 20% back to GradeActivity field 'score'.
        setScore(average);
    }
}

