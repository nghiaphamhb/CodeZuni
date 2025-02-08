public class Score {
    private double math, physic, chemistry;

    public Score() {
        this.math = 0;
        this.physic = 0;
        this.chemistry = 0;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAverageScore() {
        return (math + physic + chemistry)/3;
    }

    public String getRank(){
        double averageScore = getAverageScore();
        String rank;
        if(averageScore >= 9){
            rank = "Xuất Sắc";
        }
        else if (averageScore >= 8 && averageScore < 9){
            rank = "Giỏi";
        }
        else if (averageScore >= 7 && averageScore < 8){
            rank = "Khá";
        }
        else if (averageScore >= 6 && averageScore < 7){
            rank = "TB Khá";
        }
        else if (averageScore >= 5 && averageScore < 6){
            rank = "TB";
        }
        else{
            rank = "Yếu";
        }
        return rank;
    }
}
