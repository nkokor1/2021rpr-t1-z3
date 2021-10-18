package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	Sat sat = new Sat(15, 30, 45);
    sat.ispisi();
    sat.sljedeci();
    sat.pomjeriZa(-48);
    sat.ispisi();
    sat.postavi(0, 0, 0);
    sat.ispisi();
    }
}
