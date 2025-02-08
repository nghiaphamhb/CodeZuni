import java.util.Scanner;

public class Student {
    private String name;
    private long id;
    private Score score;
    private double averageScore;
    private String rank;

    public Student() {
        this.name = "";
        this.id = 0;
        this.score = new Score();
        this.averageScore = 0;
        this.rank = "";
    }

    public void insertInfo (Scanner sc){
        sc.nextLine();
        System.out.print("Enter the name of the student : ");
        this.name = sc.nextLine();
        System.out.print("Enter the id of the student : ");
        this.id = sc.nextLong();

        while(true){
            System.out.print("Enter the math's score of the student (0 -> 10): ");
            double math = sc.nextDouble();
            if (math <= 10 && math >= 0){
                this.score.setMath(math);
                break;
            }
            System.out.println("The number is invalid. Try again! ");
        }

        while (true){
            System.out.print("Enter the physic's score of the student (0 -> 10): ");
            double physic = sc.nextDouble();
            if (physic <= 10 && physic >= 0){
                this.score.setPhysic(physic);
                break;
            }
            System.out.println("The number is invalid. Try again! ");
        }

        while (true){
            System.out.print("Enter the chemistry's score of the student (0 -> 10): ");
            double chem = sc.nextDouble();
            if (chem <= 10 && chem >= 0){
                this.score.setChemistry(chem);
                break;
            }
            System.out.println("The number is invalid. Try again! ");
        }

        this.averageScore = this.score.getAverageScore();
        this.rank = this.score.getRank();
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Score getScore() {
        return score;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getRank() {
        return rank;
    }
}
