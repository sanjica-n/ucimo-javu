/**
 *
 * @author damjan
 */
public class Radnik {

    private String ime;
    private long jmbg;
    private int staz;
    private double plata;
    
    // konstruktor
    public Radnik(String i, long id, int s, double p) {
        ime = i;
        jmbg = id;
        staz = s;
        plata = p;
    }
    
    public String getIme() {
        return ime;
    }
    
    public long getJmbg() {
        return jmbg;
    }
    
    public int getStaz() {
        return staz;
    }
    
    public double getPlata() {
        return plata;
    }
    
    public void povecajPlatu(double procenat) {
        plata += plata * procenat / 100;    // moze i this.plata
    }
    
}
