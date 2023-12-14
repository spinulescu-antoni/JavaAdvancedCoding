package polimorfism;

public class Tester extends Angajat{

    public Tester(String nume, double salariuDeBaza, int aniExperienta) {
        super(nume, salariuDeBaza, aniExperienta);
    }

    public double calculBonus(){
        double bonus = 500;
        if (aniExperienta <= 5) {
            bonus = 1000;
        }
        return bonus;
    }

    @Override
    public double calculSalariu() {
        return super.calculSalariu() + calculBonus();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tester{");
        sb.append("aniExperienta=").append(aniExperienta);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", salariuDeBaza=").append(salariuDeBaza);
        sb.append('}');
        return sb.toString();
    }
}
