
public class Grades {
    
    public int lab1;
    public int lab2;
    public int lab3;

    public Grades(int lab1, int lab2, int lab3) {
        this.lab1 = lab1;
        this.lab2 = lab2;
        this.lab3 = lab3;
    }

    public double getAverage() {
        return (lab1+lab2+lab3);
    }
}
