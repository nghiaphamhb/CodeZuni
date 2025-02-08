import java.util.Objects;
import java.util.Scanner;

public class StudentManager {
    private final Student[] students;
    private int numberOfStudents;

    public StudentManager(int n) {
        this.students = new Student[n];
        this.numberOfStudents = n;
    }

    public void addStudent(Scanner sc){
        int i = 0, n = numberOfStudents;
        while (n-- > 0){
            students[i] = new Student();
            students[i++].insertInfo(sc);
            System.out.println(i + " student(s) added!");
        }
        System.out.println("\nU have added " + i + " students. What do u want to do with them?");
    }

    public void getAverageScorePerStudent(){
        int i = 0, n = numberOfStudents;
        System.out.println("Name || ID || Average score");
        while (n-- > 0){
            System.out.println(students[i].getName() + " | " + students[i].getId() + " | " + students[i].getAverageScore());
            i ++;
        }
        System.out.println("\nWhat do u want to do next?");
    }

    public void rateEachStudent(){
        int i = 0, n = numberOfStudents;
        System.out.println("Name || ID || Rating");
        while (n-- > 0){
            System.out.println(students[i].getName() + " | " + students[i].getId() + " | " + students[i].getRank());
            i ++;
        }
        System.out.println("\nWhat do u want to do next?");
    }

    public double highestAverScore(){
        int i = 0, n = numberOfStudents;
        double maxScore = 0;
        while (n-- > 0){
            double averageScore = students[i].getAverageScore();
            if (maxScore < averageScore) maxScore = averageScore;
            i ++;
        }
        return maxScore;
    }

    public void findStudentWithHighestAverScore(){
        int i = 0, n = numberOfStudents;
        double maxScore = highestAverScore();
        System.out.println("The student(s), who has the highest average score:\n" +
                "Name || ID || Average score");
        while (n-- > 0){
            if (maxScore == students[i].getAverageScore()) {
                System.out.println(students[i].getName() + " | " + students[i].getId() + " | " + students[i].getAverageScore());
            }
            i ++;
        }
        System.out.println("\nWhat do u want to do next?");
    }

    public void findStudentWithLowestRank(){
        int i = 0, n = numberOfStudents;
        System.out.println("The student(s), who has the lowest rank:\n" +
                "Name || ID || Rank");
        while (n-- > 0){
            if (Objects.equals(students[i].getRank(), "Yếu")) {
                System.out.println(students[i].getName() + " | " + students[i].getId() + " | " + students[i].getRank());
            }
            i ++;
        }
        System.out.println("\nWhat do u want to do next?");
    }

    public void findStudentByName(Scanner sc){
        int i = 0, n = numberOfStudents;
        System.out.print("Enter his/her name: ");
        String foundName = sc.nextLine();
        System.out.println("The student(s), who has that name:\n" +
                "Name || ID");
        while (n-- > 0){
            if (Objects.equals(students[i].getName(), foundName)) {
                System.out.println(students[i].getName() + " | " + students[i].getId());
            }
            i ++;
        }
        System.out.println("\nWhat do u want to do next?");
    }

    public void findStudentByID(Scanner sc){
        int i = 0, n = numberOfStudents;
        System.out.print("Enter his/her ID: ");
        long foundID = sc.nextLong();
        sc.nextLine();
        System.out.println("The student(s), who has that ID:\n" +
                "Name || ID");
        while (n-- > 0){
            if (students[i].getId() == foundID) {
                System.out.println(students[i].getName() + " | " + students[i].getId());
                break;
            }
            i ++;
        }
        System.out.println("\nWhat do u want to do next?");
    }

    public void deleteStudentByID(Scanner sc){
        int i = 0, n = numberOfStudents, deleted_i = -1;
        System.out.print("Enter his/her ID: ");
        long foundID = sc.nextLong();
        sc.nextLine();
        while (n-- > 0){
            if (students[i].getId() == foundID) {
                deleted_i = i;
                break;
            }
            i ++;
        }
        if (deleted_i == -1){
            System.out.println("The id " + foundID + " is invalid!");
        }
        else{
            for (int j = deleted_i; j < numberOfStudents - 1; j++) {
                students[j] = students[j + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
            System.out.println("The student(s), who has the ID: " + foundID + ", has been deleted!");
        }
        System.out.println("\nWhat do u want to do next?");
    }
}
