package polimorfism;

public class Programator extends Angajat {

    private double bonusOvertime;


    public Programator(String nume, double salariuDeBaza, int aniExperienta, double bonusOvertime) {
        super(nume, salariuDeBaza, aniExperienta);
        this.bonusOvertime = bonusOvertime;
    }

    @Override
    public double calculSalariu() {
        if (bonusOvertime <= 1000) {
            return super.calculSalariu() + bonusOvertime;
        } else {
            return super.calculSalariu() + 1000;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programator{");
        sb.append("bonusOvertime=").append(bonusOvertime);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", salariuDeBaza=").append(salariuDeBaza);
        sb.append('}');
        return sb.toString();
    }
}