import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hi guys! Welcome to my Java exercise!\nEnter the number of students you want to add: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StudentManager stdManager = new StudentManager(n);
        stdManager.addStudent(sc);

        while(true){
            System.out.print(
                    "1. Get average score per student\n" +
                            "2. Rate each student\n" +
                            "3. Find student, who has the highest average score\n" +
                            "4. Find all students, who has rank \"Yếu\" \n" +
                            "5. Find student by his name\n" +
                            "6. Find student by his ID\n" +
                            "7. Delete one student by his ID\n" +
                            "8. Exit\n" +
                            "=> Enter your option: "
            );
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    stdManager.getAverageScorePerStudent();
                    break;
                case 2:
                    stdManager.rateEachStudent();
                    break;
                case 3:
                    stdManager.findStudentWithHighestAverScore();
                    break;
                case 4:
                     stdManager.findStudentWithLowestRank();
                     break;
                case 5:
                    stdManager.findStudentByName(sc);
                    break;
                case 6:
                    stdManager.findStudentByID(sc);
                    break;
                case 7:
                    stdManager.deleteStudentByID(sc);
                    break;
                case 8: return;
                default:
                    System.out.println("Invalid option. Choose again!\n");
            }
        }
    }
}
