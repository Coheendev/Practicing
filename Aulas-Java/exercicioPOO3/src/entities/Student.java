package entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalNote () {
       return nota1 + nota2 + nota3;

    }

    public double missingPoints() {
        if (finalNote() < 60.0) {
            return 60.0 - finalNote();
        } else {
            return 0.0;
        }
    }

}
