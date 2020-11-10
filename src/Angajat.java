public class Angajat {
    protected String nume ;
    protected int varsta ;
    protected  int  nrAniExperienta ;
    protected int tarifPerOra ;
    int nivel ;
    int nrOreLucrate ;

    public Angajat(String nume , int varsta , int nrAniExperienta , int tarifPerOra, int nivel , int nrOreLucrate){
        this.nume = nume;
        this.varsta = varsta ;
        this.nrAniExperienta = nrAniExperienta;
        this.tarifPerOra = tarifPerOra ;
        this.nrOreLucrate = nrOreLucrate ;
        this.nivel = nivel ;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getNrAniExperienta() {
        return nrAniExperienta;
    }

    public int getTarifPerOra() {
        return tarifPerOra;
    }

    public int getNivel() {
        return nivel;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public int SalariuAngajat()
    {
        return this.nrOreLucrate*this.tarifPerOra;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", nrAniExperienta=" + nrAniExperienta +
                ", tarifPerOra=" + tarifPerOra +
                ", nivel=" + nivel +
                ", nrOreLucrate=" + nrOreLucrate +
                '}';
    }
}
