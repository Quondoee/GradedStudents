package Students;


public class Student {
    private String firstName;
    private String lastName;
    private double[] examScores;
    private int scoreCount;

    // Constructor
    public Student(String firstName, String lastName, Double[] initialScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new double[10];
        this.scoreCount = 0;

        for (Double score : initialScores) {
            addExamScore(score);
        }
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public void addExamScore(double score) {
        if (scoreCount < examScores.length) {
            examScores[scoreCount] = score;
            scoreCount++;
        } else {
            System.out.println("Cannot add more scores. Maximum limit reached.");
        }
    }


    public double getAverageExamScore() {
        double total = 0;

        for (double score : examScores) {
            if (score != 0.0) {
                total = total + score;
            }
        }
        return scoreCount > 0 ? total / scoreCount : 0.0;
    }


    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + ", Average Score: " + getAverageExamScore();
    }
}