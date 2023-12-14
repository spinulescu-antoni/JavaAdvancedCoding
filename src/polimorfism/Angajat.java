package polimorfism;

public class Angajat {
    protected String nume;
    protected double salariuDeBaza;

    protected int aniExperienta;

    public Angajat(String nume, double salariuDeBaza, int aniExperienta) {
        this.nume = nume;
        this.salariuDeBaza = salariuDeBaza;
        this.aniExperienta = aniExperienta;
    }

    public double calculSalariu(){
        return salariuDeBaza;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariuDeBaza=" + salariuDeBaza +
                '}';
    }
}
