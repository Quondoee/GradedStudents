package Students;

public class Classroom {
    private Student[] students;
    private int studentCount;


    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
        studentCount = 0;
    }


    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Classroom is full! Cannot add more students.");
        }
    }


    public String[] getGradeBook() {
        String[] gradeBook = new String[studentCount];
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            double average = student.getAverageExamScore();
            String grade;


            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else if (average >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            gradeBook[i] = student.getFirstName() + " " + student.getLastName() + " - Grade: " + grade;
        }
        return gradeBook;
    }

}
