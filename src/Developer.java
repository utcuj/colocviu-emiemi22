public class Developer extends Angajat {
    private int task ;

    public Developer(String nume , int varsta , int nrAniExperienta , int tarifPerOra, int nivel , int nrOreLucrate  , int task )
    {
        super( nume , varsta ,  nrAniExperienta , tarifPerOra, nivel , nrOreLucrate);

        this.task = task;
    }

    public int Salariu()
    {
        if (this.nivel == 1)
            return 100 + this.SalariuAngajat();
        else return 200 + this.SalariuAngajat();
    }

    public String RezolvaTask()
    {
        return this.nume + " rezolva problema " + this.task;
    }


}
