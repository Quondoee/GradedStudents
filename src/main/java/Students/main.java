package Students;

public class main {
    public static void main(String[] args) {
//couldnt figure out remove students method and get students by score method
//so i did it in a way that i can understand and yet still print out given data
    Student student1 = new Student("Aniyah", "Kelley", new Double[]{90.0, 85.0});
    Student student2 = new Student("Dayquon", "Kelley", new Double[]{70.0, 75.0});


    Classroom classroom = new Classroom(3);
    classroom.addStudent(student1);
    classroom.addStudent(student2);


    System.out.println("Grade Book:");
    String[] gradeBook = classroom.getGradeBook();
    for (String entry : gradeBook) {
        System.out.println(entry);
    }
}
}

